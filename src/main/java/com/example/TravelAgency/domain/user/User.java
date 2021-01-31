package com.example.TravelAgency.domain.user;

import com.example.TravelAgency.domain.base.BaseEntity;
import com.example.TravelAgency.domain.trips.trip.Trip;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;
    @Embedded
    private Address address;

   @OneToMany
   private List<Trip> purchasedTrips = new ArrayList<>();

}
