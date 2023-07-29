import { Component, OnInit } from '@angular/core';
import { Addvehicle } from '../../datatypes';
import { BoatslistService } from '../userservices/boatslist.service';
import { Router } from '@angular/router';
import { AddpassengersService } from '../userservices/addpassengers.service';

@Component({
  selector: 'app-listofvehicles',
  templateUrl: './listofvehicles.component.html',
  styleUrls: ['./listofvehicles.component.css']
})
export class ListofvehiclesComponent implements OnInit {

  i:any;
  boatList: Addvehicle[] = [];
  constructor(private boat:BoatslistService, private router:Router,private addp:AddpassengersService ) { }

  ngOnInit(): void {
    this.boat.getAllAddVehicles().subscribe((result)=>{
      console.log(result);
      this.boatList=result;
    })

  }

 public submit(id:number){
  this.addp.status=false
  this.router.navigate(['/user/dashboard/addBooking',id]);
  }
  searchText: string='';

  onSearchTextEntered(searchValue: string){
    this.searchText=searchValue;
    console.log(this.searchText);
    console.log(searchValue);
  }

}
