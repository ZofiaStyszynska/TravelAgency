package com.example.TravelAgency.domain.trips;

import com.example.TravelAgency.domain.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Country extends BaseEntity {

    private String countryName;
    @Enumerated (value = EnumType.STRING)
    private Continent continent;
}
