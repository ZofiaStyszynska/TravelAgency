package com.example.TravelAgency.domain.user;

import com.example.TravelAgency.domain.base.BaseEntity;
import com.example.TravelAgency.domain.trips.trip.TripDTO;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Value
public class UserDTO {

    Long id;
    String firstName;
    String lastName;
    String email;
    Address address;
    List<TripDTO> purchasedTrips;

    public static UserDTO fromUser(User user) {
        return new UserDTO(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                new Address(user.getAddress().getCityName(),user.getAddress().getStreetName(),user.getAddress().getHouseNumber(),
                        user.getAddress().getPostalCode()),
                user.getPurchasedTrips().stream().map(TripDTO::fromTrip)
                .collect(Collectors.toList())

        );
    }

    static List<TripDTO> getPurchasedTripsFromUser(User user){
        return user.getPurchasedTrips().stream()
                .map(TripDTO::fromTrip)
                .collect(Collectors.toList());
    }

}
