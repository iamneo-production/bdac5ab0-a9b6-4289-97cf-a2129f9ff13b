import { Component, OnInit } from '@angular/core';
import { Addvehicle, bookingDetails } from '../../datatypes';
import { AuthService } from '../../auth/auth.service';
import { BookingdetailsService } from '../userservices/bookingdetails.service';
import { BoatslistService } from '../userservices/boatslist.service';
import { AddpassengersService } from '../userservices/addpassengers.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-add-booking',
  templateUrl: './add-booking.component.html',
  styleUrls: ['./add-booking.component.css']
})
export class AddBookingComponent implements OnInit {

  vid!: number;
  flag=true;
  c=this.addp.status
  bookings:bookingDetails=new bookingDetails();
  booked:bookingDetails=new bookingDetails();
  currentDate:any=new Date();
  vehicles:Addvehicle= new Addvehicle();
  constructor(public booking:BookingdetailsService,private auth:AuthService,private r:ActivatedRoute,public boat: BoatslistService, private route:Router,private addp:AddpassengersService){}
  
  
  ngOnInit():void{
    if(this.c){
      this.flag=false // if flag is false grid2 will be displayed
      console.log(this.booking.bid);
      this.booking.getBookingDetailsId(this.booking.bid).subscribe((data:any)=>{
        console.log(data);
        this.booked=data
        
      })
      
    }
    else{
      this.flag=true
    }
    this.vid=this.r.snapshot.params['id'];
    this.boat.vehid=this.vid;
    this.boat.getVehicleById(this.vid).subscribe(data=>{
      console.log(data);
      this.vehicles=data;
    })
  }

  validation(data: bookingDetails){
    if((this.bookings.fromDate==null)||(this.bookings.fromDate=='')||(this.bookings.toDate==null)||(this.bookings.toDate=='') ){
      alert("Enter all the details");
    }
    else if((data.noOfPersons > this.vehicles.vehicleCapacity) ||(this.bookings.noOfPersons==null)){
      //alert(data.noOfPersons+" "+this.vehicles.vehicleCapacity)
      alert("Please Select passengers within the vehicle capacity: "+this.vehicles.vehicleCapacity)
    }
    else{
      console.log(data.fromDate);
      console.log(data.startTime);
      
      const totalH=this.calculateHours()
      if(totalH<=0){
        alert("Please select valid date and time." )
      }
      else{
        this.addBookingDetails(data);
      }
    }
  }
  
  submit(data:bookingDetails){
    this.validation(data);
    
  }
  calculatePrice(){
    console.log("called");
    const totalH=this.calculateHours()
    if(totalH<=0){
      alert("Please select valid date and time." )
    }
    else{
      this.bookings.totalPrice=this.bookings.noOfPersons * (this.vehicles.price * this.totalHours)
      console.log(this.totalHours," ",this.bookings.totalPrice," ",this.bookings.noOfPersons," ",this.vehicles.price);

    }
}

  totalHours!:any
  calculateHours(){
    let time= Math.abs(new Date(this.bookings.toDate).getTime() - new Date(this.bookings.fromDate).getTime());
    let dHours=Math.ceil(time/(1000*60*60));
    let [hour1,min1]=this.bookings.startTime.split(":");
    let [hour2,min2]=this.bookings.endTime.split(":");
    if(parseInt(hour2)-parseInt(hour1)<=0){
      console.log(parseInt(hour2)-parseInt(hour1)); 
      alert("End time must not be lesser than start time");
      return -1;
    }
    else{
      this.totalHours=dHours+(parseInt(hour2)-parseInt(hour1));
      console.log("Total Hours: ",this.totalHours);
      return this.totalHours;
  }
    // this.totalHours=dHours+(parseInt(hour2)-parseInt(hour1));
    // console.log("Total Hours: ",this.totalHours);
    // return this.totalHours
}
// calculateHours(){
//   let time= Math.abs(new Date(this.bookings.toDate).getTime() - new Date(this.bookings.fromDate).getTime());
//   let dHours=Math.ceil(time/(1000*60*60));
//   let [hour1,min1]=this.bookings.startTime.split(":");
//   let [hour2,min2]=this.bookings.endTime.split(":");
  
//     
// }
  public bid!: number;
  addBookingDetails(data:bookingDetails){
    data.vehicleId=Number(this.vid);
    data.userId=this.auth.userId;
    data.address=this.vehicles.vehicleAddress;
    data.pricePerPerson=this.vehicles.price;
    data.totalPrice= data.noOfPersons * this.vehicles.price * this.totalHours
    data.boatName=this.vehicles.vehicleName
    console.log(data);
    console.log(data.startTime," ",data.startTime," ",typeof(data.startTime)," ",typeof(data.endTime));
    
    this.booking.addBooking(data).subscribe((result:any)=>{
      console.log(result)
      this.bid=result.bookingId;
      this.booking.bid=result.bookingId;
       this.booking.persons=data.noOfPersons;
      this.navigateToAddP(this.bid)
    });  
  }

  navigateToAddP(id:number){
    this.route.navigate(["/user/dashboard/addPassengers",id])
  }

}
