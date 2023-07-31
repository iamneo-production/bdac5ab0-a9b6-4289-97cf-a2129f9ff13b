












import { Component, OnInit } from '@angular/core';
import { LoginauthService } from '../../auth/loginauth.service';


@Component({
  selector: 'app-adminnavbar',
  templateUrl: './adminnavbar.component.html',
  styleUrls: ['./adminnavbar.component.css']
})
export class AdminnavbarComponent implements OnInit {

  constructor(private log:LoginauthService){}
  logout(){
    this.log.logout();
  }

  ngOnInit(): void {
  }

}
