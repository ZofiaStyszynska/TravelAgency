package com.example.TravelAgency.domain.user;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Embeddable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Address {
    private String cityName;
    private String streetName;
    private String houseNumber;
    private String postalCode;
}


