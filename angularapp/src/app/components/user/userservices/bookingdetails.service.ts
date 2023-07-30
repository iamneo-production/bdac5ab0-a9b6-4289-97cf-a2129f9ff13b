import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { LoginauthService } from '../../auth/loginauth.service';
import { bookingDetails } from '../../datatypes';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BookingdetailsService {

  public bid!: number;
  public persons!:any;
  public total!:any;

  
  // url="http://localhost:3000/bookingDetails";
  // baseUrl="http://localhost:3000/edit--Booking"
  private baseUrl1="http://localhost:9595/user";
  baseurl='https://8080-aadaacfafcfdbcdfcefbbcfabeafbabbafdec.project.examly.io/user';

  constructor(private http:HttpClient, private log:LoginauthService) { }

  addBooking(data:bookingDetails){
    //console.warn("service called");
    const headers = new HttpHeaders().set('Authorization', this.log.token);
    return this.http.post(`${this.baseurl}/`+`addbooking`,data,{headers});
  }
  getAllBookings():Observable<bookingDetails[]>{
    console.log(bookingDetails);
    const headers = new HttpHeaders().set('Authorization', this.log.token);
    return this.http.get<bookingDetails[]>(`${this.baseurl}/`+`booking`,{headers});
  }
  getBookingDetailsId(id:number):Observable<bookingDetails>{
    const headers = new HttpHeaders().set('Authorization', this.log.token);
    console.log(id,headers);
    return this.http.get<bookingDetails>(`${this.baseurl}/`+`booking/`+`${id}`,{headers});
  }
  getBookingDetailsByUserId(id:number):Observable<bookingDetails>{
    const headers = new HttpHeaders().set('Authorization', this.log.token);
    return this.http.get<bookingDetails>(`${this.baseurl}/`+`userbooking/`+`${id}`,{headers});
  }
  saveBooking(bookingDetails:bookingDetails):Observable<Object>{
    const headers = new HttpHeaders().set('Authorization', this.log.token);
    return this.http.post(`${this.baseurl}/savebooking/${bookingDetails.bookingId}`,bookingDetails,{headers});
  }
  deleteBooking(id:number):Observable<Object>{
    const headers = new HttpHeaders().set('Authorization', this.log.token);
    console.log(id,headers);
    return this.http.delete(`${this.baseurl}/`+`deletebooking/`+`${id}`,{headers});
  }
}
