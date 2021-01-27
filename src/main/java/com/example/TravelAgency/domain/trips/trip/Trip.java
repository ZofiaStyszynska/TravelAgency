package com.example.TravelAgency.domain.trips.trip;

import com.example.TravelAgency.domain.base.BaseEntity;
import com.example.TravelAgency.domain.trips.Continent;
import com.example.TravelAgency.domain.trips.city.City;
import com.example.TravelAgency.domain.trips.country.Country;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.time.LocalDate;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trip extends BaseEntity {


    private String tripName;
    private Continent continent;
    @OneToOne      //czy ta relacja tu będzie ok ?
    private Country country;
    @OneToOne     // czy ta relacja tu będzie ok ?
    private City city;
    private LocalDate tripStartDate;
    private LocalDate tripEndDate;
}
