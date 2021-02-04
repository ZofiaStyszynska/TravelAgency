package com.example.TravelAgency.domain.trips.country;

import com.example.TravelAgency.domain.trips.Continent;
import lombok.Value;

@Value
public class CountryDTO {

    Long id;
    String countryName;
    Continent continent;

    public static CountryDTO formCountry (Country country) {
        return new CountryDTO(
                country.getId(),
                country.getCountryName(),
                country.getContinent()
        );
    }
}
