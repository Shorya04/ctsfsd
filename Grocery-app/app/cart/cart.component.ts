import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {

  public image_url='http://rjtmobile.com/grocery/images/';
  public cart:any;
  public amount=0;

  constructor() { 

    this.cart=JSON.parse(localStorage.cart);
  }

    

  ngOnInit(): void {
  }

}
