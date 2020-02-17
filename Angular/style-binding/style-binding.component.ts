import { Component, OnInit } from '@angular/core';

@Component({
  selector: "app-style-binding"
  ,
  template: `
  <h1 style="color:brown">Hi</h1>
  <h1 [style.color]=" 'pink'">hello</h1>
  <h1 [style.color]="hasError ? 'green' : 'red'">printing red if error, else green!</h1> 
  <h1 [style.background]="bgColor">shorya</h1>
  <h1 [ngStyle]="special">Great</h1>
  `,
  styles:[]
})
export class StyleBindingComponent implements OnInit {


  hasError=true;
  bgColor="cyan"

  special={
    color:'orange',
    fontStyle:'italic',
    fontSize:'38px'
  }

  constructor() { }

  ngOnInit(): void {
  }

}
