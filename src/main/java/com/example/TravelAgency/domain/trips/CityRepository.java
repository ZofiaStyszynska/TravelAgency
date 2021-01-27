package com.example.TravelAgency.domain.trips;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository <City, Long> {

List<City> findByCountry (String country);
}

