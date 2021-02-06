import {Component, OnInit} from '@angular/core';
import {User} from "../user";
import {AppComponent} from "../app.component";

import {UserService} from "../user.service";
import {ActivatedRoute, Params} from "@angular/router";
import {Trip} from "../trip/trip";

@Component({
  selector: 'app-users-account',
  templateUrl: './users-account.component.html',
  styleUrls: ['./users-account.component.css']
})
export class UsersAccountComponent implements OnInit {

  trips:Trip[];
  title: AppComponent;
  user: User

  constructor(private  userService: UserService, private router: ActivatedRoute) {
  }

  ngOnInit() {
    this.router.params.subscribe((params: Params) => {
      this.userService.findUser(params['id']).subscribe(user => {
        this.user = user;
      })
    });



  }



}
