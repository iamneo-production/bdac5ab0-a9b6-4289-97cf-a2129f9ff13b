import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ProfileDetails } from '../../datatypes';
import { AuthService } from '../../auth/auth.service';
import { Router } from '@angular/router';
import { ProfileService } from '../userservices/profile.service';

@Component({
  selector: 'app-editprofile',
  templateUrl: './editprofile.component.html',
  styleUrls: ['./editprofile.component.css']
})
export class EditprofileComponent implements OnInit {

  profileModel : ProfileDetails=new ProfileDetails();

  constructor(public ps:ProfileService, private auth: AuthService,private route:Router){ }

  ngOnInit(): void{
    this.ps.getDetailsById(this.auth.userId).subscribe((result:any)=>{
      console.log(result);
      this.profileModel=result;
    })
  }
  
  editProfile= new FormGroup(
    {
      fname:new FormControl(),
      lname:new FormControl(),
      username:new FormControl(),
      mobileNumber:new FormControl(),
      gender:new FormControl(),
      dOB: new FormControl(String)
    }
  ) 
  
  date:any
  onSubmit(){
    this.date=(this.profileModel.dOB).toString();
    console.log((this.date).typeOf)
    console.log(this.profileModel.fname)
    console.log(this.profileModel);
    
    this.ps.updateDetails(this.auth.userId,this.profileModel).subscribe({
      next:(data: any)=>{
        console.log(data)
        alert("Your profile updated successfully!")
        this.route.navigate(['/user/profile'])
        },
        error:(error)=>{
          alert("Sorry something went wrong!")
        }
    })
  }

}

