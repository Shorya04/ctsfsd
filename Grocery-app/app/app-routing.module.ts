import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router'
import { LoginComponent } from './component/login/login.component';
import { RegisterComponent } from './component/register/register.component';
import { HomeComponent } from './component/home/home.component';
import { ProductsComponent } from './component/products/products.component';
import { CartComponent } from './cart/cart.component';
import { PageNoteFoundComponent } from './component/page-note-found/page-note-found.component';

const routes: Routes =[

    { path:'login', component: LoginComponent },
    { path: 'register', component: RegisterComponent },
    { path: 'home', component: HomeComponent },
    { path: 'products/:id', component: ProductsComponent},
    { path: 'cart', component: CartComponent},
    { path: '**', component: PageNoteFoundComponent}
];

@NgModule({

    imports:[RouterModule.forRoot(routes)],
    exports:[RouterModule]

})

export class AppRouting{
    
}