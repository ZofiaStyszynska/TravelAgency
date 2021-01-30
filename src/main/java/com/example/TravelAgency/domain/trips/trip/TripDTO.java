package com.example.TravelAgency.domain.trips.trip;

import com.example.TravelAgency.domain.trips.Continent;
import com.example.TravelAgency.domain.trips.city.City;
import com.example.TravelAgency.domain.trips.country.Country;
import lombok.Value;

import java.time.LocalDate;

@Value
public class TripDTO {

    long id;
    String tripName;
    Continent continent;
    Country country;
    City city;
    LocalDate tripStartDate;
    LocalDate tripEndDate;

    public static TripDTO fromTrip (Trip trip){
        return new TripDTO(
                trip.getId(),
                trip.getTripName(),
                trip.getContinent(),
                trip.getCountry(),
                trip.getCity(),
                trip.getTripStartDate(),
                trip.getTripEndDate()
        );
    }
}
