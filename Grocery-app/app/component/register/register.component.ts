import { Component, OnInit } from '@angular/core';
import { userModel } from 'src/app/userModel';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  public register=new userModel('Shorya Singh', 'abc@gmail.com', 989745621, 'female', 'Beverages', true);

  public interests=['Beverages','Bakery','Dairy','Vegies & Fruits'];

  onSubmitForm(){
    console.log(this.register);
  }

  constructor() { }

  ngOnInit(): void {
  }

}
