import {Component, OnInit} from '@angular/core';
import {User} from "../user";

@Component({
  selector: 'app-users-account',
  templateUrl: './users-account.component.html',
  styleUrls: ['./users-account.component.css']
})
export class UsersAccountComponent implements OnInit {

  user : User = {
    id: 1,
    firstName: "Adam",
    lastName: "Kowalski",
    email : "adamk@wp.pl",
    address: "Poznań, ul. Ratajczaka 124"


  }

  constructor() {
  }

  ngOnInit(): void {

  }


}
