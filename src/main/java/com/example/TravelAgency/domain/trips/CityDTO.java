package com.example.TravelAgency.domain.trips;

import lombok.Value;


@Value
public class CityDTO {

    long id;
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
