package com.example.TravelAgency.user;

import com.sun.xml.bind.v2.TODO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

//@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor

public class User {


    @GeneratedValue
    @Id
    private Long id;
    private boolean deleted;
    private String firstName;
    private String lastName;
    private String email;
    @Embedded
    private Address address;

   // @OneToMany

    //private List<> purchasedTrips; //TODO

}
