import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { LoginauthService } from '../../auth/loginauth.service';

@Injectable({
  providedIn: 'root'
})
export class AddpassengersService {

  private   baseurl='https://8080-aadaacfafcfdbcdfcefbbcfabeafbabbafdec.project.examly.io/user';

  private baseUrl1="http://localhost:9595/user";

 public status!: boolean;
 constructor(private http: HttpClient, private log:LoginauthService) { }
 
 addPassenger(data:any){
  const headers = new HttpHeaders().set('Authorization', this.log.token);
   console.warn("service called");
   console.log(data,headers);
   
    return this.http.post(`${this.baseurl}/`+`addpassenger`,data,{headers});
 }

 deletePassenger(id:number):Observable<Object>{
  const headers = new HttpHeaders().set('Authorization', this.log.token);
  console.log(id,headers);
  return this.http.delete(`${this.baseurl}/`+`deletepassenger/`+`${id}`,{headers});
}

}
