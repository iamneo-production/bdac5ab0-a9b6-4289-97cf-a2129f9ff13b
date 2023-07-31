import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminhomepageComponent } from './adminhomepage/adminhomepage.component';
import { AdddetailsComponent } from './adddetails/adddetails.component';
import { AdminvehicleprofileComponent } from './adminvehicleprofile/adminvehicleprofile.component';

import { AdmineditvehicleComponent } from './admineditvehicle/admineditvehicle.component';
import { LoginComponent } from '../auth/login/login.component';
import { AdminactivateService } from '../services/adminactivate.service';

const routes: Routes = [
  {
    path:'admin',
    component:AdminhomepageComponent,
    canActivate:[AdminactivateService],
    children:[
      {path:'admin-addvehicle',component:AdddetailsComponent},
      {path:'admin-vehicleprofile',component: AdminvehicleprofileComponent},
      {path:'admin-editbooking/:id',component:AdmineditvehicleComponent},
      //{path:'admin-deletevehicle',component:DeleteVehicleComponent},
      {path:'logout',component:LoginComponent},
     ]
  },
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AdminRoutingModule { }
