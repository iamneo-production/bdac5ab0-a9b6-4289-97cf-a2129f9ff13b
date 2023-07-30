import { Component, OnInit } from '@angular/core';
import { Addvehicle } from '../../datatypes';
import { AddvehicleService } from '../addvehicle.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminvehicleprofile',
  templateUrl: './adminvehicleprofile.component.html',
  styleUrls: ['./adminvehicleprofile.component.css']
})
export class AdminvehicleprofileComponent implements OnInit {

  getVehicles!: Addvehicle[];
  

  constructor(private addvehicleService: AddvehicleService,private router:Router ){}

  ngOnInit(): void{
    this.displayUser();
  }

  displayUser(){
    this.addvehicleService.getAllAddVehicles().subscribe(data =>{
      console.log(data);
      this.getVehicles=data;
    })
  }

  editVehicle(id:number){
    console.log(typeof(id))
    this.router.navigate(['admin/admin-editbooking', id]);
  }
  
  deleteVehicle(id:number){
    console.log(typeof(id))
    this.addvehicleService.deleteVehicle(id).subscribe(data =>{
      this.displayUser();
    })
  }

}

