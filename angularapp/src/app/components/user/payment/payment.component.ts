










import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { BookingdetailsService } from '../userservices/bookingdetails.service';
import { ActivatedRoute, Router } from '@angular/router';
import { PaymentService } from '../userservices/payment.service';
import { bookingDetails } from '../../datatypes';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent implements OnInit {

  amount:number=0;
  orderForm!:FormGroup;
  price:number=500;
  quantity :number=1;
  extendedHourCost: number = 100;
  showAlert:boolean=false;
  constructor(private booking:BookingdetailsService,private payment:PaymentService,private r:ActivatedRoute,private formBuilder: FormBuilder,private router:Router){}
 
  /*ngOnInit() {
    this.orderForm = this.formBuilder.group({
      name: ['', [Validators.required, Validators.minLength(3), Validators.maxLength(20)]],
      email: ['', [Validators.required]],
      phone: ['', [Validators.required, Validators.minLength(10), Validators.maxLength(10)]],
      price: ['', Validators.required],
      hours: ['', Validators.required],
      quantity: ['', Validators.required],
      amount: [{ value: '', disabled: true }],

    });
  }*/
  id!: number;
  tPrice!:any
  bookingDetails:bookingDetails=new bookingDetails();
  ngOnInit() {
    this.id=this.r.snapshot.params['id'];
    this.booking.getBookingDetailsId(this.id).subscribe((result)=>{
      console.log(result);
      this.bookingDetails=result;
      this.tPrice= Number(result.totalPrice)
      //this.bookingDetails.totalPrice=this.bookingDetails.noOfPersons*this.bookingDetails.pricePerPerson;
    });
    this.orderForm = this.formBuilder.group({
      name: ['', [Validators.required, Validators.minLength(3), Validators.maxLength(20)]],
      email: ['', [Validators.required, Validators.email]],
      phone: ['', [Validators.required, Validators.minLength(10), Validators.maxLength(10)]],
      price: ['', Validators.required],
      hours: ['', Validators.required],
      quantity: ['', Validators.required],
      amount: [{ value: '', disabled: true }],
    });
  }
  
  // calculateAmount() {
  //   const hours = this.orderForm.get('hours')?.value;
  //   const quantity = this.orderForm.get('quantity')?.value;

  //   if (hours <= 12) {
  //     this.amount = quantity* this.price;
  //   } 
  //   else {
  //     const normalHoursCost = quantity* this.price;
  //     const extendedHours = hours - 12;
  //     this.amount = normalHoursCost + extendedHours * this.extendedHourCost;
  //   }
  //   this.orderForm.get('amount')?.setValue(this.amount);
  // }
  
  pay(){
    //this.calculateAmount();
    const name = this.orderForm.get('name')?.value;
  const email = this.orderForm.get('email')?.value;
  const phone = this.orderForm.get('phone')?.value;
    const options = {
      "key": "rzp_test_IH683NPniGYdGt", 
      "amount": this.tPrice*100, 
      "currency": "INR",
      "name": "Ship Booking", 
      "description": "Online Ship Booking",
      
      "order_id": "", 
      // "callback_url": "https://eneqd3r9zrjok.x.pipedream.net/",
      "prefill": { 
          "name": name, 
          "email": email,
          "contact": phone 
      },
      "notes": {
        "address": "Razorpay",
      },
      "theme": {
          "color": "#3399cc"
      }
  };
  
  //  let rzp1=new this.payment.nativeWindow.Razorpay(options);
  //  rzp1.on('payment.success', (response: any) => {
  //   console.log(response);
    
  //   this.orderForm.reset();
  // });
  //  rzp1.open();
  
   let rzp1=new this.payment.nativeWindow.Razorpay(options);
   rzp1.on('payment.success', (response: true) => {
    console.log(response);
    
    this.router.navigate(['/user/home']);
  });
  rzp1.on('payment.error', (response: false) => {
    console.error('Payment failed:', response);
  });
  rzp1.open();
  this.router.navigate(['/user/home']);
  }

}

