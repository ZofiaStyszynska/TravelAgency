import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Params} from "@angular/router";
import {HttpClient} from "@angular/common/http";
import {Trip} from "./trip";

@Component({
  selector: 'app-trip',
  templateUrl: './trip.component.html',
  styleUrls: ['./trip.component.css']
})
export class TripComponent implements OnInit {

  public trip: Trip;
  constructor(private router: ActivatedRoute, private http: HttpClient) { }

  ngOnInit(): void {
    this.router.params.subscribe((params: Params) => {
     this.http.get('http://localhost:8080/trips/' + params['id']).subscribe((value:Trip) => this.trip=value);
    })


  }


}
