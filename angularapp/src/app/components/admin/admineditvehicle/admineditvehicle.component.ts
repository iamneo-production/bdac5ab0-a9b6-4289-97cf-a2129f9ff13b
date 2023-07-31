import { Component, OnInit } from '@angular/core';
import { AddvehicleService } from '../addvehicle.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Addvehicle } from '../../datatypes';

@Component({
  selector: 'app-admineditvehicle',
  templateUrl: './admineditvehicle.component.html',
  styleUrls: ['./admineditvehicle.component.css']
})
export class AdmineditvehicleComponent implements OnInit {

  id!:number;
  vehicles: Addvehicle =new Addvehicle();

  constructor(private addvehicleService: AddvehicleService,private router: Router,private route:ActivatedRoute){}

  ngOnInit(): void{
    this.id=this.route.snapshot.params['id'];
    this.addvehicleService.getVehicleById(this.id).subscribe(data=>{
    this.vehicles=data;
    })
  }

  validation(){
    if((this.vehicles.vehicleName==null || this.vehicles.vehicleName=='')||(this.vehicles.vehicleAvailableTiming==null || this.vehicles.vehicleAvailableTiming=='') || (this.vehicles.vehicleAddress==null || this.vehicles.vehicleAddress=='') || (this.vehicles.vehicleImageURL==null || this.vehicles.vehicleImageURL=='') || (isNaN(this.vehicles.price)) ||(this.vehicles.vehicleCapacity==null || this.vehicles.vehicleCapacity=='') || (this.vehicles.vehicleDescription==null || this.vehicles.vehicleDescription=='')){
      alert('Enter all the details....');
    }
    else{
      this.editVehicle();
    }
  }
  
  editVehicle(){
    this.addvehicleService.editVehicle(this.id, this.vehicles).subscribe(data =>{
    console.log(data);
    alert("Vehicle details submitted successfully")
    this.goToAddvehicleList();
    },error => console.log(error));
  }

  goToAddvehicleList(){
    this.router.navigate(['/admin/admin-vehicleprofile']);
  }

}
