import { Component, OnInit, EventEmitter, Output } from '@angular/core';


@Component({
  selector: 'app-child-to-parent',
  templateUrl: './child-to-parent.component.html',
  styleUrls: ['./child-to-parent.component.css']
})
export class ChildToParentComponent implements OnInit {

  @Output()
  public childEvent=new EventEmitter();

  onButtonClicked(){
    this.childEvent.emit("Recieving Data from Child")
  }

  constructor() { }

  ngOnInit(): void {
  }

}
