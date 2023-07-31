
import { Component, OnInit } from '@angular/core';
import { passenger } from '../../datatypes';
import { AddpassengersService } from '../userservices/addpassengers.service';
import { BoatslistService } from '../userservices/boatslist.service';
import { BookingdetailsService } from '../userservices/bookingdetails.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-addpassengers',
  templateUrl: './addpassengers.component.html',
  styleUrls: ['./addpassengers.component.css']
})
export class AddpassengersComponent implements OnInit {

  det=new passenger();
  dataarray:any[]=[];
  count!: number;
  ngOnInit(): void {
    console.log("This is Constructor");
    console.log(this.count);
    this.det=new passenger();
    this.bid=this.r.snapshot.params['id'];
    this.det.bookingId=this.bid;
    this.dataarray.push(this.det);
      
  }

  constructor(private addpassengers:AddpassengersService,private r:ActivatedRoute, private route:Router,public book:BookingdetailsService, private boat:BoatslistService){
    console.log("This is Constructor");
    
    this.count=1
  }
  bid!: number;
  onSubmit(){
    console.log(typeof(this.dataarray));
    if(this.count!=this.book.persons){
      alert("Please enter details of "+this.book.persons+ " people.")
    }
    else{
      
      this.addpassengers.addPassenger(this.dataarray).subscribe((result:any)=>{
        console.log(result)
      });
      console.log("Above navigate",this.boat.vehid)
      this.addpassengers.status=true;
      this.route.navigate(["/user/dashboard/addBooking/",this.boat.vehid]);
    }
  }

  removeForm(i: any){
    this.dataarray.splice(i);
    this.count-=1
  }
  persons=this.book.persons
  addForm(){
    if(this.count>=this.persons){
      alert("You cannot add persons more than "+ this.book.persons ) //
    }
    else{
      this.count+=1
      this.det=new passenger();
      this.det.bookingId=this.bid;
      console.log(this.bid," ",this.det.bookingId);
      
      this.dataarray.push(this.det);
    }
  }

}
