import {Component, OnInit} from '@angular/core';
import {User} from "../user";
import {Trip} from "../trip";
import {TRIPS} from "../mock-trips";
import {MatCard} from "@angular/material/card";
import {AppComponent} from "../app.component";

import {UserService} from "../user.service";

@Component({
  selector: 'app-users-account',
  templateUrl: './users-account.component.html',
  styleUrls: ['./users-account.component.css']
})
export class UsersAccountComponent implements OnInit {

  trips = TRIPS;
  title: AppComponent;
  user: User

  constructor(private  userService: UserService) { }

  ngOnInit() { this.userService.findUser().subscribe(data => {
    this.user = data;
  });
  }


}
