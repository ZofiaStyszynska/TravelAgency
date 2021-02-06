import {Component, OnInit} from '@angular/core';
import {Trip} from "../trip/trip";
import {TripListView} from "./trip-list-view";
import {ActivatedRoute, Params} from "@angular/router";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {User} from "../user";
import {findAll} from "@angular/compiler-cli/ngcc/src/utils";
import {TripService} from "../trip.service";

@Component({
  selector: 'app-trip-view',
  templateUrl: './trip-view.component.html',
  styleUrls: ['./trip-view.component.css']
})
export class TripViewComponent implements OnInit {

  tripList: Trip[]
  user:User


  constructor(private tripService:TripService) {
  }

  ngOnInit():void {
    this.tripService.findAll().subscribe(data=> {
    this.tripList =data;
  })}}


