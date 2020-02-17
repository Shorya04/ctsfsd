import { Component, OnInit } from '@angular/core';
import { EmployeeServiceService } from '../employee-service.service';

@Component({
  selector: 'app-pipes-table',
  templateUrl: './pipes-table.component.html',
  styleUrls: ['./pipes-table.component.css']
})
export class PipesTableComponent implements OnInit {

employees=[];
  
  constructor(private  dataService :EmployeeServiceService) {
   this.employees=dataService.getEmployees();
    
   }

  ngOnInit(): void {
  }

}
