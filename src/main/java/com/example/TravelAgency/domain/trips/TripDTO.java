package com.example.TravelAgency.domain.trips;

import lombok.Value;

import javax.persistence.OneToOne;
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
