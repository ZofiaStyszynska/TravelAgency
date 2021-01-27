package com.example.TravelAgency.domain.trips.country;

import com.example.TravelAgency.domain.trips.Continent;
import com.example.TravelAgency.domain.trips.country.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository <Country, Long> {

    List<Country> findByContinent (Continent continent);
}
