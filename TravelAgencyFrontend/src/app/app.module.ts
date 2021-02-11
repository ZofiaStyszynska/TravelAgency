import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppComponent} from './app.component';
import {ContinentComponent} from './continent/continent.component';
import {HeaderComponent} from './header/header.component';
import {LoginComponent} from './login/login.component';
import {MainSiteComponent} from './main-site/main-site.component';
import {UsersAccountComponent} from './users-account/users-account.component';
import {FormsModule} from "@angular/forms";
import {RouterModule, Routes} from "@angular/router";
import {MatSliderModule} from '@angular/material/slider';
import {MatCardModule} from "@angular/material/card";
import {UserListComponent} from './users-account/user-list/user-list.component';
import {UserFormComponent} from "./users-account/user-form/user-form.component";
import {HttpClientModule} from "@angular/common/http";
import {TripComponent} from './trip/trip.component';
import {TripViewComponent} from "./trip-view/trip-view.component";
import { ContinentTripsComponent } from './continent-trips/continent-trips.component';
import {MatInputModule} from '@angular/material/input';


const routes: Routes = [
  {path: '', redirectTo: 'home', pathMatch: 'full'},
  {path: 'userdata/:id', component: UsersAccountComponent},
  {path: 'home', component: MainSiteComponent},
  {path: 'adduser', component: UserFormComponent},
  {path: 'users', component: UserListComponent},
  {path: 'trip/:id', component: TripComponent},
  {path: 'trips/usertrips/:id', component: TripViewComponent},
  {path: 'continent/:continent', component: ContinentTripsComponent}


]

@NgModule({
  declarations: [
    AppComponent,
    ContinentComponent,
    HeaderComponent,
    LoginComponent,
    MainSiteComponent,
    UsersAccountComponent,
    UserListComponent,
    UserFormComponent,
    TripComponent,
    TripViewComponent,
    ContinentTripsComponent,

  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot(routes),
    MatSliderModule,
    MatCardModule,
    HttpClientModule,
    MatInputModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule { }
