import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ContinentComponent } from './continent/continent.component';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { MainSiteComponent } from './main-site/main-site.component';

@NgModule({
  declarations: [
    AppComponent,
    ContinentComponent,
    HeaderComponent,
    LoginComponent,
    MainSiteComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
