import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-twobinding',
  templateUrl: './twobinding.component.html',
  styleUrls: ['./twobinding.component.css']
})
export class TwobindingComponent implements OnInit {

  name="shorya";

  onButtonClicked(value){
   console.log(value);

  
  }

  constructor() { }

  ngOnInit(): void {
  }

}
