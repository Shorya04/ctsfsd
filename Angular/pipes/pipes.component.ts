import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent implements OnInit {

  name="Navitha chappidi";
  currentDate=new Date();

  person={
    firstname:"Navitha",
    lastname:"Chappidi",
    salary:5000,
    email:"navu@gmail.com"
  }

  constructor() { }

  ngOnInit(): void {
  }

}
