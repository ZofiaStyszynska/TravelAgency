import {Component, OnInit} from '@angular/core';
import {User} from "../user";
import {Trip} from "../trip";
import {TRIPS} from "../mock-trips";
import {MatCard} from "@angular/material/card";

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
    address: "Poznań, ul. Ratajczaka 124",
    purchasedTrips: TRIPS,
  }
trips = TRIPS;


  constructor() {
  }

  ngOnInit(): void {

  }



}
