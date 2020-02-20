import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class DataService {

  private base_url="http://apolis-grocery.herokuapp.com/api/";
  private category_url="category";
  private subCategory_url="subcategory/";
  private prod_url="products/";

  constructor(private http:HttpClient) { }

    getCategories():Observable<any> {
  return this.http.get<any>(`${this.base_url + this.category_url}`)
    }
    
    getSubCategory(catId):Observable<any>{
      return this.http.get<any>(`${this.base_url+ this.subCategory_url+catId}`)
    }

    getProducts(subId):Observable<any>{
      return this.http.get<any>(`${this.base_url + this.prod_url + subId}`)
    }
}
