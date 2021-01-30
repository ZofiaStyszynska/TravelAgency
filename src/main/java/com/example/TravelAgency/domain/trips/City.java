package com.example.TravelAgency.domain.trips;


import com.example.TravelAgency.domain.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City extends BaseEntity {

    private String cityName;
    @OneToOne // czy ta relacja będzie tu ok ?
    private Country country;
}
