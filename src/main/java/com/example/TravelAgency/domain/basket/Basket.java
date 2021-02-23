package com.example.TravelAgency.domain.basket;

import com.example.TravelAgency.domain.base.BaseEntity;
import com.example.TravelAgency.domain.trips.trip.Trip;
import com.example.TravelAgency.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Basket extends BaseEntity {

    @OneToOne
    private Trip trip;
    private Integer quantityOfAdults;
    private Integer quantityOfChildren;
    private BigDecimal tripPrice;
    @OneToOne
    private User user;
}
