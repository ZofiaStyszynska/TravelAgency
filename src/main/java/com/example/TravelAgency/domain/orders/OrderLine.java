package com.example.TravelAgency.domain.orders;

import com.example.TravelAgency.domain.base.BaseEntity;
import com.example.TravelAgency.domain.trips.trip.Trip;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.math.BigDecimal;

@Setter
@Getter
@Entity
@ToString
public class OrderLine extends BaseEntity implements Serializable {

    @OneToOne
    private Trip trip;

    private Integer quantity;

    private BigDecimal tripPrice;

}
