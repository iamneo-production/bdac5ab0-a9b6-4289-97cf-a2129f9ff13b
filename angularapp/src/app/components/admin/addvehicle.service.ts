import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Addvehicle } from '../datatypes';
import { LoginauthService } from '../auth/loginauth.service';

@Injectable({
  providedIn: 'root'
})
export class AddvehicleService {

  private baseurl='https://8080-aadaacfafcfdbcdfcefbbcfabeafbabbafdec.project.examly.io/admin';
  

  constructor(private httpClient: HttpClient,private log:LoginauthService) { }

getAllAddVehicles():Observable<Addvehicle[]>{
  console.log(Addvehicle);
  const headers = new HttpHeaders().set('Authorization', this.log.token);
  return this.httpClient.get<Addvehicle[]>(`${this.baseurl}/`+`vehicle`,{headers});
}

  saveVehicle(addVehicle: Addvehicle):Observable<Object>{
    console.log(addVehicle);
    const headers = new HttpHeaders().set('Authorization', this.log.token);
    return this.httpClient.post(`${this.baseurl}/addVehicle`,addVehicle,{headers});
  }

  getVehicleById(vehicleId:number):Observable<Addvehicle>{
    const headers = new HttpHeaders().set('Authorization', this.log.token);
    return this.httpClient.get<Addvehicle>(`${this.baseurl}/`+`vehicle/`+`${vehicleId}`,{headers});
  }

 
  editVehicle(vehicleId:number,addvehicle:Addvehicle):Observable<Object>{
    const headers = new HttpHeaders().set('Authorization', this.log.token);
    return this.httpClient.put(`${this.baseurl}/editVehicle/${vehicleId}`,addvehicle,{headers});
  }

  deleteVehicle(vehicleId:number):Observable<Object>{
    const headers = new HttpHeaders().set('Authorization', this.log.token);
    return this.httpClient.delete(`${this.baseurl}/deleteVehicle/${vehicleId}`,{headers});
  }
}
