import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';


import { AppComponent } from './app.component';
import { NavbarComponent } from './component/navbar/navbar.component';
import { HomeComponent } from './component/home/home.component';
import { FooterComponent } from './component/footer/footer.component';
import { HeaderComponent } from './component/header/header.component';
import { ProductsComponent } from './component/products/products.component';
import { CartComponent } from './cart/cart.component';
import { LoginComponent } from './component/login/login.component';
import { RegisterComponent } from './component/register/register.component';
import { AppRouting } from './app-routing.module';
import { PageNoteFoundComponent } from './component/page-note-found/page-note-found.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms'

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomeComponent,
    FooterComponent,
    HeaderComponent,
    ProductsComponent,
    CartComponent,
    LoginComponent,
    RegisterComponent,
    PageNoteFoundComponent
    
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRouting,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
