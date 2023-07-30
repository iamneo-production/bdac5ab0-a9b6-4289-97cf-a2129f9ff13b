import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { UserComponent } from './user/user.component';
import { UserhomepageComponent } from './userhomepage/userhomepage.component';
import { ProfileComponent } from './profile/profile.component';
import { EditprofileComponent } from './editprofile/editprofile.component';
import { UserdashboardComponent } from './userdashboard/userdashboard.component';
import { UserbookingsComponent } from './userbookings/userbookings.component';
import { AddBookingComponent } from './add-booking/add-booking.component';
import { AddpassengersComponent } from './addpassengers/addpassengers.component';
import { EditbookingComponent } from './editbooking/editbooking.component';
import { UseractivateService } from '../services/useractivate.service';
import { PaymentComponent } from './payment/payment.component';
const routes: Routes = [
  {
    path:'user',
    component:UserComponent,
    canActivate:[UseractivateService],
    children:[
      { path: '',  component: UserhomepageComponent},
      { path: 'home', component: UserhomepageComponent},
      { path: 'profile', component: ProfileComponent},
      { path: 'edit', component: EditprofileComponent},
      { path: 'dashboard', component: UserdashboardComponent,
        children:[{ path: 'addBooking/:id', component: AddBookingComponent},{ path: 'addPassengers/:id', component: AddpassengersComponent}]},
      { path: 'myBooking', component: UserbookingsComponent},
      { path: 'addPassenger', component: AddpassengersComponent},
      { path: 'payment/:id', component: PaymentComponent},
      { path: 'editBooking/:id', component: EditbookingComponent}, 
    ]
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class UserRoutingModule { }
