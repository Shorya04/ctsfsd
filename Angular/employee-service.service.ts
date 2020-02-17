import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EmployeeServiceService {

  constructor() { }

  getEmployees(){
return[
  {"empId":"1","name":"Shorya","Gender":"Female","Salary":"21000","DateOfBirth":"12/04/1996"},
  {"empId":"2","name":"Riya","Gender":"Female","Salary":"22000","DateOfBirth":"11/20/1996"},
  {"empId":"3","name":"Sachet","Gender":"Male","Salary":"23000","DateOfBirth":"05/20/1996"},
  {"empId":"4","name":"Tarkar","Gender":"Male","Salary":"24000","DateOfBirth":"06/09/1996"}
];
}
}

