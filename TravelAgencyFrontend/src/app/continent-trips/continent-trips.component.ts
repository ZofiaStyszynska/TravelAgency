import {Component, OnInit} from '@angular/core';
import {Trip} from "../trip/trip";
import {TripService} from "../trip.service";
import {ActivatedRoute, Params} from "@angular/router";

@Component({
  selector: 'app-continent-trips',
  templateUrl: './continent-trips.component.html',
  styleUrls: ['./continent-trips.component.css']
})
export class ContinentTripsComponent implements OnInit {

  trips: Trip[]

  constructor(private tripService: TripService, private router: ActivatedRoute) {
  }

  ngOnInit(): void {
    this.router.params.subscribe((params: Params) => {
      this.tripService.findTripsByContinent(params['continent'])
        .subscribe((data: Trip[]) => {
          this.trips = data
        })
    })
  }

}
