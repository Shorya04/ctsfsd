import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-class-binding',
  template:`
  <h1 class="special">Welcome Guest</h1>
  <h1 [class]="classSuccess">Mark</h1>
  <h1 [class.success]="hasError">No error</h1>
  <h1 [ngClass]="message">Printing Error message green if success, red if error.</h1>
  `,
  styleUrls: ['./class-binding.component.css']
})
export class ClassBindingComponent implements OnInit {

  classSuccess="success"
  hasLine=true
  hasError=false

  message={
    'success':this.hasError,
    'danger':!this.hasError,
    'underline':this.hasLine
  }
  constructor() { }

  ngOnInit(): void {
  }

}
