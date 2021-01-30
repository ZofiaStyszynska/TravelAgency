package com.example.TravelAgency.domain.user;

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

    public static UserDTO fromUser(User user) {
        return new UserDTO(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getAddress()

        );
    }

    static List<TripDTO> getPurchasedTripsFromUser(User user){
        return user.getPurchasedTrips().stream()
                .map(TripDTO::fromTrip)
                .collect(Collectors.toList());
    }

}
