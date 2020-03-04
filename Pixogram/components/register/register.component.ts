import { Component, OnInit } from '@angular/core';
import { Register } from 'src/app/model/register';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {


  public register= new Register('','','','');
  constructor() { }
  
  

  ngOnInit(): void {
  }

  onSubmitForm(){
    console.log(this.register);
  }
}
