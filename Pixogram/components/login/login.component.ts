import { Component, OnInit } from '@angular/core';


import {  Login } from 'src/app/model/login';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  

public login = new Login('','');

  constructor() { }

  ngOnInit(): void {
   
  }
  onSubmitForm(){
    console.log(this.login)
  }
  
    }
  