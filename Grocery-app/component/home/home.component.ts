import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  public categories:any;
  public image_url='http://rjtmobile.com/grocery/images/';
 

  constructor(private dataService: DataService) { 
    this.dataService.getCategories().subscribe(d=>this.categories=d.data)
  }

  ngOnInit(): void {
  }

}
