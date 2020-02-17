import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-component-interaction',
  templateUrl: './component-interaction.component.html',
  styleUrls: ['./component-interaction.component.css']
})
export class ComponentInteractionComponent implements OnInit {

 

  constructor() { }


  @Input()
  public parentData;

  ngOnInit(): void {
  }

}
