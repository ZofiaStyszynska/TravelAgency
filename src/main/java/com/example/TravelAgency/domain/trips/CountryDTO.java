package com.example.TravelAgency.domain.trips;

import lombok.Value;

@Value
public class CountryDTO {

    long id;
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
