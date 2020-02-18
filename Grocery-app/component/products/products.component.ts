import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  public subcategories: any;
  public products: any;
  public image_url='http://rjtmobile.com/grocery/images/';
  

  constructor(private dataService: DataService) {
    this.dataService.getSubCategory(1).subscribe(d => this.subcategories = d.data);

    this.dataService.getProducts(1).subscribe(p=> this.products=p.data);
  }

  ngOnInit(): void {
  }

}
