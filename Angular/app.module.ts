import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import {MyComponent} from './custom.component';
import { from } from 'rxjs';
import { HelloComponent } from './hello/hello.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { MainContentComponent } from './main-content/main-content.component';
import { NavbarComponent } from './navbar/navbar.component';
import { DataBindingComponentComponent } from './data-binding-component/data-binding-component.component';
import { PropertyBindingComponent } from './property-binding/property-binding.component';
import { EventBindingComponent } from './event-binding/event-binding.component';
import { ClassBindingComponent } from './class-binding/class-binding.component';
import { StyleBindingComponent } from './style-binding/style-binding.component';
import { DirectivesComponent } from './directives/directives.component';
import { TwobindingComponent } from './twobinding/twobinding.component';

@NgModule({
  declarations: [
    AppComponent,
    MyComponent,
    HelloComponent,
    HeaderComponent,
    FooterComponent,
    SidebarComponent,
    MainContentComponent,
    NavbarComponent,
    DataBindingComponentComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    ClassBindingComponent,
    StyleBindingComponent,
    DirectivesComponent,
    TwobindingComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
