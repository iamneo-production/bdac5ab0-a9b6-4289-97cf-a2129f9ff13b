import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(value: any, filterString: string) {
    
    
    if (value.length === 0 || filterString === '' || filterString === undefined || filterString === null) {
      return value;
    }

    const users = [];
    
    for (const user of value) {
      if(user['vehicleName'].toLowerCase().includes (filterString.toLowerCase()) || 
         user['vehicleAddress'].toLowerCase().includes (filterString.toLowerCase) ||
         user["price"].toLowerCase().includes (filterString.toLowerCase())) {
         users.push(user);
      }
    }
    return users;
  }


}
