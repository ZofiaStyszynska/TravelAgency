import {Component, OnInit} from '@angular/core';
import {User} from "../user";
import {Trip} from "../trip";
import {TRIPS} from "../mock-trips";
import {MatCard} from "@angular/material/card";
import {AppComponent} from "../app.component";
import {user1} from "../mock-users";

@Component({
  selector: 'app-users-account',
  templateUrl: './users-account.component.html',
  styleUrls: ['./users-account.component.css']
})
export class UsersAccountComponent implements OnInit {

  user = user1;
  trips = TRIPS;
  title: AppComponent;

  constructor() {
  }

  ngOnInit(): void {

  }


}
