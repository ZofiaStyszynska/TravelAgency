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

const routes: Routes = [
  {path:'', redirectTo:'home', pathMatch:'full'},
  {path: 'users', component: UsersAccountComponent},
  {path: 'home', component: MainSiteComponent}

]

@NgModule({
  declarations: [
    AppComponent,
    ContinentComponent,
    HeaderComponent,
    LoginComponent,
    MainSiteComponent,
    UsersAccountComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
