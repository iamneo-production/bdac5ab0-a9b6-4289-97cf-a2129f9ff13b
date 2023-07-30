import { Component, OnInit } from '@angular/core';
import { LoginauthService } from '../../auth/loginauth.service';

@Component({
  selector: 'app-usernavbar',
  templateUrl: './usernavbar.component.html',
  styleUrls: ['./usernavbar.component.css']
})
export class UsernavbarComponent implements OnInit {

  constructor(private log:LoginauthService){ }

  logout(){
    this.log.logout();
  }
  ngOnInit(): void {
  }

}
