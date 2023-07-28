import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Addvehicle } from 'src/app/components/datatypes';
import { AddvehicleService } from '../addvehicle.service';


@Component({
  selector: 'app-adddetails',
  templateUrl: './adddetails.component.html',
  styleUrls: ['./adddetails.component.css']
})
export class AdddetailsComponent implements OnInit {

  vehicles: Addvehicle =new Addvehicle();

  constructor(private addvehicleService: AddvehicleService,private router: Router){}

  ngOnInit(): void{

  }

  validation(){
    if((this.vehicles.vehicleName==null || this.vehicles.vehicleName=='')||(this.vehicles.vehicleAvailableTiming==null || this.vehicles.vehicleAvailableTiming=='') || (this.vehicles.vehicleAddress==null || this.vehicles.vehicleAddress=='') || (this.vehicles.vehicleImageURL==null || this.vehicles.vehicleImageURL=='') || (isNaN(this.vehicles.price)) ||(this.vehicles.vehicleCapacity==null || this.vehicles.vehicleCapacity=='') || (this.vehicles.vehicleDescription==null || this.vehicles.vehicleDescription=='')){
      alert('Enter all the details....');
    }
    else{
      alert("Vehicle added successfully.")
      this.addUser();
      
    }
  }
  
  addUser(){
    console.log(this.vehicles)
    this.addvehicleService.saveVehicle(this.vehicles).subscribe((data:any) =>{
      console.log(data);
      this.goToAddvehicleList();
    },error => console.log(error));
  }

  onSubmit(){
    this.validation();
  }

  goToAddvehicleList(){
    this.router.navigate(['/admin/admin-vehicleprofile']);
  }

}
