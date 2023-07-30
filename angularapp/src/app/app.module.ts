import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddBookingComponent } from './components/user/add-booking/add-booking.component';
import { UserbookingsComponent } from './components/user/userbookings/userbookings.component';
import { UserhomepageComponent } from './components/user/userhomepage/userhomepage.component';
import { UserreviewComponent } from './components/user/userreview/userreview.component';
import { LoginComponent } from './components/auth/login/login.component';
import { SignupComponent } from './components/auth/signup/signup.component';
import { AdddetailsComponent } from './components/admin/adddetails/adddetails.component';
import { AdminhomepageComponent } from './components/admin/adminhomepage/adminhomepage.component';
import { AdminreviewComponent } from './components/admin/adminreview/adminreview.component';
import { AdminnavbarComponent } from './components/admin/adminnavbar/adminnavbar.component';
import { AdmineditvehicleComponent } from './components/admin/admineditvehicle/admineditvehicle.component';
import { AdminvehicleprofileComponent } from './components/admin/adminvehicleprofile/adminvehicleprofile.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { AddpassengersComponent } from './components/user/addpassengers/addpassengers.component';
import { EditbookingComponent } from './components/user/editbooking/editbooking.component';
import { EditprofileComponent } from './components/user/editprofile/editprofile.component';
import { ListofvehiclesComponent } from './components/user/listofvehicles/listofvehicles.component';
import { PaymentComponent } from './components/user/payment/payment.component';
import { ProfileComponent } from './components/user/profile/profile.component';
import { SearchbarComponent } from './components/user/searchbar/searchbar.component';
import { UserComponent } from './components/user/user/user.component';
import { UserdashboardComponent } from './components/user/userdashboard/userdashboard.component';
import { UsernavbarComponent } from './components/user/usernavbar/usernavbar.component';
import { FilterPipe } from './components/user/userservices/filter.pipe';
import { HttpClientModule } from '@angular/common/http';
import { UserRoutingModule } from './components/user/user-routing.module';
import { AdminRoutingModule } from './components/admin/admin-routing.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatDialogModule } from '@angular/material/dialog';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatRadioModule } from '@angular/material/radio';

@NgModule({
  declarations: [
    AppComponent,
    AddBookingComponent,
    UserbookingsComponent,
    UserhomepageComponent,
    UserreviewComponent,
    LoginComponent,
    SignupComponent,
    AdddetailsComponent,
    AdminhomepageComponent,
    AdminreviewComponent,
    AdminnavbarComponent,
    AdmineditvehicleComponent,
    AdminvehicleprofileComponent,
    AddpassengersComponent,
    EditbookingComponent,
    EditprofileComponent,
    ListofvehiclesComponent,
    PaymentComponent,
    ProfileComponent,
    SearchbarComponent,
    UserComponent,
    UserdashboardComponent,
    UsernavbarComponent,
    FilterPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule,
    BrowserAnimationsModule,
    HttpClientModule,
    UserRoutingModule,
    AdminRoutingModule,
    MatButtonModule,
    MatIconModule,
    MatRadioModule,
    MatDialogModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
