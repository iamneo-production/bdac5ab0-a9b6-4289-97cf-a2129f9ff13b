import { Injectable } from '@angular/core';
import { ProfStorage, ProfileDetails } from '../../datatypes';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { LoginauthService } from '../../auth/loginauth.service';

@Injectable({
  providedIn: 'root'
})
export class ProfileService {

  constructor(private http:HttpClient,private log:LoginauthService) { }

  private baseUrl='http://localhost:3000/details'
  private intUrl='https://8080-aadaacfafcfdbcdfcefbbcfabeafbabbafdec.project.examly.io/getUserById'
  private udtUrl='https://8080-aadaacfafcfdbcdfcefbbcfabeafbabbafdec.project.examly.io/updateProfile'
  getDetails(){
    return this.http.get<ProfStorage>(`${this.baseUrl}`);
  }
  updateDetails(id:number,data: ProfileDetails){
    const headers = new HttpHeaders().set('Authorization', this.log.token);
    return this.http.put(`${this.udtUrl}/${id}`,data,{headers});
    
  }
  getDetailsById(id:number){
    const headers = new HttpHeaders().set('Authorization', this.log.token);
    console.log(id);
    return this.http.get<ProfileDetails>(`${this.intUrl}/${id}`,{headers});
  }
}

