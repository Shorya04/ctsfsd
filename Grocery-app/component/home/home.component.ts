import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/services/data.service';
import { Router} from '@angular/router'

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  public categories:any;
  public image_url='http://rjtmobile.com/grocery/images/';
 

  constructor(private dataService: DataService, private router:Router) { 
    this.dataService.getCategories().subscribe(d=>this.categories=d.data)
  }

  onSelectCategory(cards){
    console.log(cards.catId)
    this.router.navigate(['/products',cards.catId])
  }

  ngOnInit(): void {
  }

}
