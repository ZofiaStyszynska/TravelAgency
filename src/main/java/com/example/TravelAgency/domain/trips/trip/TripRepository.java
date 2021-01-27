package com.example.TravelAgency.domain.trips.trip;

import com.example.TravelAgency.domain.trips.Continent;
import com.example.TravelAgency.domain.trips.city.City;
import com.example.TravelAgency.domain.trips.country.Country;
import com.example.TravelAgency.domain.trips.trip.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {

    List<Trip> findByTripName (String trip);
    List<Trip> findByContinent (Continent continent);
    List<Trip> findByCountry (Country country);
    List<Trip> findByCity (City city);
    List<Trip> findByTripStartDate (LocalDate tripStartDate);
    List<Trip> findByTripEndDate (LocalDate country);

}
