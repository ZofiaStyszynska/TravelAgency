import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ContinentComponent } from './continent/continent.component';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { MainSiteComponent } from './main-site/main-site.component';
import { UsersAccountComponent } from './users-account/users-account.component';
import {FormsModule} from "@angular/forms";
import {Route, RouterModule, Routes} from "@angular/router";
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatSliderModule } from '@angular/material/slider';
import {MatCardModule} from "@angular/material/card";
import { TripComponent } from './trip/trip.component';
import {HttpClientModule} from "@angular/common/http";


const routes: Routes = [
  {path:'', redirectTo:'home', pathMatch:'full'},
  {path: 'users', component: UsersAccountComponent},
  {path: 'home', component: MainSiteComponent},
  {path: 'trip/:id', component: TripComponent}

]

@NgModule({
  declarations: [
    AppComponent,
    ContinentComponent,
    HeaderComponent,
    LoginComponent,
    MainSiteComponent,
    UsersAccountComponent,
    TripComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot(routes),
    BrowserAnimationsModule,
    MatSliderModule,
    MatCardModule,
    HttpClientModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
