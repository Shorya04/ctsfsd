import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  template: `
  <button (click)="onButtonClicked()" class="btn btn-info">Click Here</button>
  `,
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent implements OnInit {

  onButtonClicked(){
    console.log("bye");
  }

  constructor() { }

  ngOnInit(): void {
  }

}
