import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

public userLoginForm: FormGroup;

  constructor( private fb: FormBuilder ) { }

  ngOnInit(): void {
    this.createForm()
  }

  createForm(){
    this.userLoginForm=this.fb.group({
      'email':[null,Validators.required],
      'password':[null,Validators.required]
    })
  }



  onSubmitForm(data){
    console.log(data)

  }
}
