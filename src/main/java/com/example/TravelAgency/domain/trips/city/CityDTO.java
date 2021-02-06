package com.example.TravelAgency.domain.trips.city;

import com.example.TravelAgency.domain.trips.country.Country;
import lombok.Value;


@Value
public class CityDTO {

    Long id;
    String cityName;
    Country country;

    public static CityDTO fromCity (City city){
        return new CityDTO(
                city.getId(),
                city.getCityName(),
                city.getCountry()
        );
    }

}
