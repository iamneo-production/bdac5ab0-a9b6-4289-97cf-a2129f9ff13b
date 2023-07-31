



import { Component, OnInit } from '@angular/core';
import { Addvehicle, bookingDetails } from '../../datatypes';
import { BookingdetailsService } from '../userservices/bookingdetails.service';
import { ActivatedRoute, Router } from '@angular/router';
import { BoatslistService } from '../userservices/boatslist.service';
import { AddpassengersService } from '../userservices/addpassengers.service';

@Component({
  
  selector: 'app-editbooking',
  templateUrl: './editbooking.component.html',
  styleUrls: ['./editbooking.component.css']
  
})
  
export class EditbookingComponent implements OnInit {

  id!: number;
  vehicles:Addvehicle= new Addvehicle();
  bookingDetails:bookingDetails=new bookingDetails();
  
  constructor(private booking:BookingdetailsService,private r:ActivatedRoute,private route:Router,public boat: BoatslistService, private addp:AddpassengersService){}
  ngOnInit(): void{
    
    this.id=this.r.snapshot.params['id'];
    this.booking.getBookingDetailsId(this.id).subscribe((result)=>{
      console.log(result);
      
      this.bookingDetails=result;
      this.getVehicle()
      
      //this.bookingDetails.totalPrice=this.bookingDetails.noOfPersons*this.bookingDetails.pricePerPerson;
    });

  } 

  getVehicle(){
    console.log(this.bookingDetails.vehicleId);

  this.boat.getVehicleById(this.bookingDetails.vehicleId).subscribe(data=>{
    console.log(data);
    this.vehicles=data;
  })
  }

  public required=true;
  currentDate:any=new Date();
  public isDisabled=true;

  saveBooking()
  {
    //console.warn(data);
    console.log(this.bookingDetails);
    
    if((this.bookingDetails.noOfPersons > this.vehicles.vehicleCapacity) ||(this.bookingDetails.noOfPersons==null)){
      //alert(data.noOfPersons+" "+this.vehicles.vehicleCapacity)
      alert("Please Select passengers within the vehicle capacity: "+this.vehicles.vehicleCapacity)
      
    }
      
    else{
      
      this.booking.saveBooking(this.bookingDetails).subscribe((result)=>{
        console.log(this.bookingDetails);
        alert("Booking Updated Successfully")
      this.route.navigate(['/user/myBooking'])
        
      });
    }
    
    
  }
  totalHours!:any
  calculatePrice()
  
  {
    let time= Math.abs(new Date(this.bookingDetails.toDate).getTime() - new Date(this.bookingDetails.fromDate).getTime());
    let dHours=Math.ceil(time/(1000*60*60));
    let [hour1,min1]=this.bookingDetails.startTime.split(":");
    
    let [hour2,min2]=this.bookingDetails.endTime.split(":");
    this.totalHours=dHours+(parseInt(hour2)-parseInt(hour1));
    this.bookingDetails.totalPrice=this.bookingDetails.noOfPersons * (this.vehicles.price * this.totalHours)
    console.log(this.totalHours," ",this.bookingDetails.totalPrice," ",this.bookingDetails.noOfPersons," ",this.vehicles.price);

  }

  

}
