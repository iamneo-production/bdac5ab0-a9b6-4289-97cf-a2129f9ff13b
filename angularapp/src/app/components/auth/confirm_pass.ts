import { AbstractControl, ValidationErrors, ValidatorFn } from '@angular/forms';
  
  export const confirm_PasswordValidator: ValidatorFn = (control: AbstractControl): ValidationErrors | null => {
    let password=control.get('Password');
    let confirmpassword=control.get('ConfirmPassword');
    if(password?.value != confirmpassword?.value)
        return{
            PasswordNoMatch: true 
        }  
    return null;
}

