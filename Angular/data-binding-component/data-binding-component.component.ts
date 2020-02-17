import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding-component',
  template: `
  <h1>Data Binding Demo</h1>,
  <h2>Shorya</h2>
  <h2>{{ name }}</h2>
  <h2>{{ 1+2 }}</h2>
  <h2>{{ name.toUpperCase() }}</h2>
  <h2>{{ name.length }}</h2>
  <h2>{{ getMessage() + name}}
  `,
  styleUrls: ['./data-binding-component.component.css']
})
export class DataBindingComponentComponent implements OnInit {

  name= "Shorya Singh";

  getMessage(){
    return "bye";
  }

  constructor() { }



  ngOnInit(): void {
  }

}
