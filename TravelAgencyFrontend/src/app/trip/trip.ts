import {Country} from "./country";
import {City} from "./city";

export interface Trip {
  id: number;
  tripName: string;
  continent: string;
  country: Country;
  city: City;
  tripStartDate: Date;
  tripEndDate: Date;
  tripPrice: number;
}
