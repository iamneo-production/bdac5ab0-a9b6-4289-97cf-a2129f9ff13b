import { Injectable } from '@angular/core';
import { LoginauthService } from '../auth/loginauth.service';
import { ActivatedRouteSnapshot, Router, RouterStateSnapshot } from '@angular/router';
import { AuthService } from '../auth/auth.service';

@Injectable({
  
  providedIn: 'root'
  
})
export class AdminactivateService {

  constructor(private log:LoginauthService, private route: Router,private auth:AuthService) { }
  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean  
  {
    if(this.log.isLoggedIn())
    {
      if(this.auth.uR=='admin')
      {
        return true
      }
      alert("Access Denied!")
      this.log.logout()
      this.route.navigate(['login'])
      return false
    }
      
    else
    {
      this.route.navigate(['login'])
      return false;
    }
    
  }
  
}
