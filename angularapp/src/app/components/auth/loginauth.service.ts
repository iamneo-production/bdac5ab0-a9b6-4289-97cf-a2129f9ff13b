import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginauthService {

  constructor() { }
}import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginauthService {

  url="http://localhost:9595"
  baseurl='https://8080-aadaacfafcfdbcdfcefbbcfabeafbabbafdec.project.examly.io';


  public token:any
  public header:any
  public uId:any

  constructor(private http:HttpClient) { }
  response :any
  // Calls server to generate token
  generateToken(loginModel:any){
    return this.http.post(`${this.baseurl}/token`,loginModel);
  }

  public setHeader() {
    this.token='Bearer '+this.token
    console.log(this.token);
  }

  // To store the token in local storage
  loginUser(token: any,user:any){
    localStorage.setItem("token",token);
    localStorage.setItem("user", JSON.stringify(user));
    return token;
  }

  // To check if user is logged in or not
  isLoggedIn(){
    let token= localStorage.getItem("token");
    if(token==undefined || token==='' || token==null){
      return false;
    }else{
      return true;
    }
  }

  // To logout the user
  logout(){
    localStorage.removeItem("token");
    localStorage.removeItem("user");
    return true;
  }

  getToken(){
    return localStorage.getItem("token");
  }
}

