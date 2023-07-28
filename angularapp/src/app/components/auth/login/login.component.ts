import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { login } from '../../datatypes';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { LoginauthService } from '../loginauth.service';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginPage:FormGroup|any;
  userT:any

  loginModel: login = new login();
  constructor(private _http:HttpClient, private _route:Router, private auth:AuthService, private log:LoginauthService) { }

  ngOnInit(): void {
    
    this.loginPage = new FormGroup({
      'emailId': new FormControl(),
      'password': new FormControl()
    }) 
  }

  logg!: boolean;
  public usId! :number;

  onSubmit(){
    this.loginModel=this.loginPage.value;
    console.log("Form Submitted");
    if((this.loginModel.emailId!='' && this.loginModel.emailId!=null) && (this.loginModel.password!='' && this.loginModel.password!=null)){
        console.log("Save form ");
        // We need to generate token
        console.log(this.loginModel);
        
        this.log.generateToken(this.loginModel).subscribe((response:any)=>{
            console.log(response,response.user.userRole)
            this.auth.uR=response.user.userRole.toLowerCase()
            this.auth.userId=response.user.id
            this.log.token=response.token
            this.log.loginUser(response.token,response.user);
            this.log.setHeader()
            console.log(this.auth.uR,this.auth.userId);
            
            if(this.auth.uR=='user'){
              this._route.navigate(['user']);
            }
            else if(this.auth.uR=='admin'){
              this._route.navigate(['admin']);
            }else{
              alert("Invalid Credentials, Please check your credentials!");
            }
        }, 
          (error: any)=>{
            alert("Invalid Credentials, Please check your credentials!");
            console.log(error);      
        })  
    }else{
      console.log("Fields are Empty!");
    }
    
  }

}
