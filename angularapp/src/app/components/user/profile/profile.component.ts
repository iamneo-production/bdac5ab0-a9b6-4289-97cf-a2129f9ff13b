import { Component, OnInit } from '@angular/core';
import { ProfileDetails } from '../../datatypes';
import { AuthService } from '../../auth/auth.service';
import { ProfileService } from '../userservices/profile.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  profileModel : ProfileDetails=new ProfileDetails();

  constructor(private ps:ProfileService,private auth:AuthService){ }

  id=this.auth.userId;
  ngOnInit(): void{
    console.log(this.id);
    
    this.ps.getDetailsById(this.auth.userId).subscribe((result:any)=>{
      console.log(result);
      this.profileModel=result;
    })
  }

}


