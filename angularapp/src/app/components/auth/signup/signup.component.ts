import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { confirm_PasswordValidator } from '../confirm_pass';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { UserStorage } from '../../datatypes';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  constructor(private authService: AuthService, private router: Router) { }

  ngOnInit(): void {
  }

  dataBase: UserStorage = new UserStorage();
  registerPage = new FormGroup(
    {
      userType: new FormControl(''),
      email: new FormControl('',[Validators.required,Validators.email]),
      username : new FormControl('',[Validators.required]),
      mobileNumber: new FormControl('',[Validators.required, Validators.pattern("[6-9]{1}[0-9]{9}")]),
      password: new FormControl('',[Validators.required, Validators.pattern("(?=.*[@#$%&+*])(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,15}")]),
      confirmPassword : new FormControl('')
    },
    {
      validators: confirm_PasswordValidator
    }
  );

  get userType(){
    return this.registerPage.get('userType')
  }
  get email(){
    return this.registerPage.get('email')
  }
  get userName(){
    return this.registerPage.get('username')
  }
  get mobileNumber(){
    return this.registerPage.get('mobileNumber')
  }
  get password(){
    return this.registerPage.get('password')
  }
  get confirmPassword(){
    return this.registerPage.get('confirmPassword')
  }

  onSubmit(){
    this.validation();
  }

  validation(){
    if((this.dataBase.email==null || this.dataBase.email=='') || (this.dataBase.username==null || this.dataBase.username=='') || (this.dataBase.mobileNumber==null || this.dataBase.mobileNumber=='') || (this.dataBase.password==null || this.dataBase.password=='') || (this.dataBase.confirmPassword==null || this.dataBase.confirmPassword=='')){
      alert('Enter all the details....');
    }
    else{
      //alert("Vehicle added successfully.")
      if((this.dataBase.userRole==null || this.dataBase.userRole=='')){
        this.dataBase.userRole="user"
      }
      console.log(this.dataBase);
      
      this.addRegister();
      
    }
  }

  addRegister(){
    let type=(this.dataBase.userRole).toLowerCase();
    console.log(type);
    if(type=='user'){
      this.authService.saveUser(this.dataBase,).subscribe(data => {
        alert(data);
        this.registerPage.reset();
        console.log(data);
        this.goToLogin();
      }, (error) => {
        // alert('Something went wrong');
        const err=error.error;
        alert(err.substring(err.indexOf('"') + 1, err.lastIndexOf('"')))
        // alert(error.error);
        console.log(error.error)
        console.log(error.error.value)
      
      });
    }
    else if(type=='admin'){
      this.authService.saveAdmin(this.dataBase).subscribe(data => {
        alert(data);
        this.registerPage.reset();
        console.log(data);
        this.goToLogin();

        
      }, (error) => {
        alert('Something went wrong');
        console.log(error)});
    }else
      alert("Please check all the details.")

    }
    goToLogin(){
      this.router.navigate(['login']);
    }

}
