import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AuthRoutingModule } from './auth-routing.module';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { ViewticketsComponent } from './components/viewtickets/viewtickets.component';


@NgModule({
  declarations: [
    LoginComponent,
    RegisterComponent,
    ViewticketsComponent
  ],
  imports: [
    CommonModule,
    AuthRoutingModule
  ],
  exports: [
    LoginComponent,
    RegisterComponent,
    ViewticketsComponent
  ]
})
export class AuthModule { }
