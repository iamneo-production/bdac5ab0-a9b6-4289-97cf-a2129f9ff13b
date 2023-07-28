import { Component, OnInit } from '@angular/core';
import { bookingDetails } from '../../datatypes';
import { Router } from '@angular/router';
import { BookingdetailsService } from '../userservices/bookingdetails.service';
import { AuthService } from '../../auth/auth.service';

@Component({
  selector: 'app-userbookings',
  templateUrl: './userbookings.component.html',
  styleUrls: ['./userbookings.component.css']
})
export class UserbookingsComponent implements OnInit {

  getBookings!: bookingDetails[];
  public i=0;
  constructor(private book: BookingdetailsService,private router:Router,private auth:AuthService ){}

  ngOnInit(): void{
    this.displayUser();
  }

  displayUser(){
    this.book.getBookingDetailsByUserId(this.auth.userId).subscribe((data: any) =>{
      console.log(data);
      this.getBookings=data;
    })
  }

  edit(id:number){
    this.router.navigate(['user/editBooking',id]);
  }

  redirectToPayment(id:any) {
    console.log(id);
    
    this.router.navigate(['user/payment',id]);
  }
  

}
