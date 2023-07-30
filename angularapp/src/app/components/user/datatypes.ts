export class profile{
    fname!:string
    lname!:string
    email!:string
    username!:string
    number!:number
    gender!:any
    dob!:any
    id!: number
    UserType!: string;
}

export class Addvehicle {
    vehicleId!: number
    vehicleName!: string
    vehicleAvailableTiming!: string
    vehicleAddress!: string
    vehicleImageURL!: string
    price!: number;
    vehicleCapacity!: string
    vehicleDescription!: string
    
}

export class bookingDetails{
    userId!:number
    vehicleId!:number
    fromDate!:any
    toDate!:any
    noOfPersons!:any
    boatName!:any
    address!:any
    totalPrice!:any
    bookingId!:any
    pricePerPerson!:any
    // fromTime!:any
    // toTime!:any
    startTime!:any
    endTime!:any
}


export class passenger{
    firstName: any;
    lastName: any;
    gender: any;
    age: any;
    id: any;
    bookingId: any;
}

export class UserStorage {
    
    id!: number
    userRole!: string;
    email!: string;
    username!: string;
    mobileNumber!: string;
    password!: string;
    confirmPassword!: string;
    gender!:string;
    dOB!:string;
}

export class login{
    // userRole!: string;
    emailId!: string;
    password!: string;
}

export class ProfileDetails{
    id!:number
    fname!: string;
    lname!: string;
    mobileNumber!: string;
    gender!: string;
    dOB!: any;
    email!: string; 
    username!: string; 
    password!: string ;
    confirmPassword!: string;
    userRole!: string;    
}

export interface ProfStorage { 
    id : number 
    fname:string
    lname:string
    usertype: string 
    email: string 
    username: string 
    mobilenumber: string 
    password: string 
    confirmpassword: string 
    gender:string 
    dOB:string 
}
    
export interface boat{
    name: string
    time: string
    city: string
    price: string
    image: string
    capacity: number
    desc: string
    id: number
}
    
    
    
    
    // export class bookingDetails{
    //     fromDate!:string
    //     toDate!:string
    //     Persons!:number
    //     id!:number
    // }
    // export interface bookingDetails_1{
        //     fromDate:string,
        //     toDate:string,
    //     Persons:number,
    //     id:number,
    //     boatName:string,
    //     address: string,
    //     pricePerPerson:number,
    //     totalPrice?:number
    // }
    
    // export class bookingsDetails{
        //     userId!: number
        //     vehicleId!: number
        //     fromDate:any;
        //     toDate:any;
        //     noOfPersons:any;
        //     boatName:any;
        //     address:any;
        //     pricePerPerson:any;
        //     totalPrice!:any;
        //     bookingId:any
        // }
        // export class UserDetails{
        //     id:any;
        //     fname:any;
        //     lname:any;
        //     email:any;
        //     username:any;
        //     mobilenumber:any;
        //     gender:any;
        //     dob:any;
        // }
    