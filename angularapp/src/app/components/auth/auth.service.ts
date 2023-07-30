import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, Router, RouterStateSnapshot } from '@angular/router';
import { LoginauthService } from './loginauth.service';
import { Observable } from 'rxjs';
import { UserStorage, login } from '../datatypes';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  baseurl='https://8080-aadaacfafcfdbcdfcefbbcfabeafbabbafdec.project.examly.io';
  public userId!:number
  logg=false;
  public uR: any;
  adminBool=false
  userBool=false
   constructor(private httpClient: HttpClient, private route:Router, private log:LoginauthService) { }
  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean  {

    if(this.log.isLoggedIn()){
      
      return true
    }else{
      this.route.navigate(['login'])
      return false;
    }
  }


  // -------------------

   saveUser(storageClass: UserStorage): Observable<Object>{
    console.log(storageClass);
    return this.httpClient.post(`${this.baseurl}/user/signup`, storageClass ,{responseType: 'text'});
  }

  saveAdmin(storageClass: UserStorage): Observable<Object>{
    console.log(storageClass);
    return this.httpClient.post(`${this.baseurl}/admin/signup`, storageClass,{responseType: 'text'});
  }

  isUserPresent(LoginClass: login): Observable<Object> {
    console.log(LoginClass);
    
    return this.httpClient.post(`${this.baseurl}/user/login`,LoginClass);

  }

  isAdminPresent(LoginClass: login): Observable<Object>{
    return this.httpClient.post(`${this.baseurl}/admin/login`,LoginClass);
    
  }

  getid(LoginClass:login):Observable<Object>{
    return this.httpClient.post(`${this.baseurl}/getid`,LoginClass)
  }
}
