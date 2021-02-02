package com.example.TravelAgency.domain.trips.city;


import com.example.TravelAgency.domain.base.BaseEntity;
import com.example.TravelAgency.domain.trips.country.Country;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City extends BaseEntity {

    private String cityName;
    @ManyToOne
    private Country country;
}
