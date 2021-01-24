package com.example.TravelAgency.userDb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity {


    private String firstName;
    private String lastName;
    private String email;
    @Embedded
    private Address address;

    @OneToMany
    @JoinColumn
    private List<Trip> purchasedTrips;

}
