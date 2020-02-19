import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/services/data.service';
import { ActivatedRoute} from '@angular/router';
import { Router} from '@angular/router';


@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  [x: string]: any;

  public catId;
  public subcategories: any;
  public products: any;
  public image_url='http://rjtmobile.com/grocery/images/';
  

  constructor(private dataService: DataService, private activateRoute: ActivatedRoute) {
    this.catId=activateRoute.snapshot.paramMap.get('id')
    this.dataService.getSubCategory(this.catId).subscribe(d => this.subcategories = d.data);

    this.dataService.getProducts(1).subscribe(p=> this.products=p.data);

  
  }

 
  
  onSelectSubCategory(subId){
    console.log(subId);
    this.dataService.getProducts(subId).subscribe(s=>this.products=s.data)
  }

  addToCart(prod){
    if(localStorage.cart==undefined){
      console.log(prod);
      var cartItems=[];
      cartItems.push(prod);
      localStorage.cart=JSON.stringify(cartItems);
    }
    else{
      var products=JSON.parse(localStorage.cart);
      products.push(prod);
      localStorage.cart=JSON.stringify(products);
    
    }
  }
  
  ngOnInit(): void {
  }

}

