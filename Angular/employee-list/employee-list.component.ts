import { Component, OnInit } from '@angular/core';
import { EmployeeServiceService } from '../employee-service.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  employees=[];

  constructor(private dataService:EmployeeServiceService) {
    this.employees=dataService.getEmployees();
   }

  

  ngOnInit(): void {
  }

}
