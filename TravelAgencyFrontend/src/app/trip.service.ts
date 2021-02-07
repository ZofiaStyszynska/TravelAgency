import {Injectable} from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {TripViewComponent} from "./trip-view/trip-view.component";
import {Trip} from "./trip/trip";
import {User} from "./user";

@Injectable({
  providedIn: 'root'
})
export class TripService {


  private tripUrl: string;

  constructor(private http: HttpClient) {
    this.tripUrl = 'http://localhost:8080/trips/'
  }

  public findAll(): Observable<Trip[]> {
    return this.http.get<Trip[]>(this.tripUrl);
  }

  public findTripsByUser(id:number): Observable<Trip[]> {
    return this.http.get<Trip[]>(this.tripUrl +'/usertrips/'+ id);
  }
}
