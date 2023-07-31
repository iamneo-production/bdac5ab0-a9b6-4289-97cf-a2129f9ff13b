<<<<<<< HEAD
<<<<<<< HEAD
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [];
=======
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './components/auth/login/login.component';
import { SignupComponent } from './components/auth/signup/signup.component';


const routes: Routes = [
  { path: '', component: LoginComponent},
  { path: 'signup', component: SignupComponent},
  { path: 'login', component: LoginComponent},
  { path: 'user/login', component: LoginComponent},
  { path: 'admin/login', component: LoginComponent},
  { path: 'user/signup', component: SignupComponent},
  { path: 'admin/signup', component: SignupComponent}
];
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
<<<<<<< HEAD
=======
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './components/auth/login/login.component';
import { SignupComponent } from './components/auth/signup/signup.component';


const routes: Routes = [
  { path: '', component: LoginComponent},
  { path: 'signup', component: SignupComponent},
  { path: 'login', component: LoginComponent},
  { path: 'user/login', component: LoginComponent},
  { path: 'admin/login', component: LoginComponent},
  { path: 'user/signup', component: SignupComponent},
  { path: 'admin/signup', component: SignupComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
>>>>>>> d6e745b12f0d7edfee44d4d32c67e0b84b1524b6
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
