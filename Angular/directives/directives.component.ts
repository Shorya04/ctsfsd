import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directives',
  templateUrl: './directives.component.html',
  styleUrls: ['./directives.component.css']
})
export class DirectivesComponent implements OnInit {

  hasError=true;

  isLoggedIn=false;

  number="four";

  names=["shorya","sachet","riya","tarkar"]

  employees= [
    {"empId":"1", "empName":"Shorya", "age":"22"},
    {"empId":"2", "empName":"Riya", "age":"22"},
    {"empId":"3", "empName":"Sachet", "age":"23"},
    {"empId":"4", "empName":"Tarkar", "age":"23"}
 ]

  constructor() { }

  ngOnInit(): void {
  }

}
