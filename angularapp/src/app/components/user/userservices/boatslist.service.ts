import { Injectable } from '@angular/core';
import { Addvehicle } from '../../datatypes';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { LoginauthService } from '../../auth/loginauth.service';

@Injectable({
  providedIn: 'root'
})
export class BoatslistService {

  public vehid!: number;
  constructor(private http:HttpClient, private log:LoginauthService) { }

  private baseUrl="http://localhost:9595/admin";
  baseurl='https://8080-aadaacfafcfdbcdfcefbbcfabeafbabbafdec.project.examly.io/admin';

  
  getAllAddVehicles():Observable<Addvehicle[]>{
    console.log(Addvehicle);
    const headers = new HttpHeaders().set('Authorization', this.log.token);
    return this.http.get<Addvehicle[]>(`${this.baseurl}/`+`vehicle`,{headers});
  }
  getVehicleById(vehicleId:number):Observable<Addvehicle>{
    const headers = new HttpHeaders().set('Authorization', this.log.token);
    return this.http.get<Addvehicle>(`${this.baseurl}/`+`vehicle/`+`${vehicleId}`,{headers});
  }
}
