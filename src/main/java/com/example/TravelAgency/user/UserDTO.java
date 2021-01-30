package com.example.TravelAgency.user;

import lombok.Value;


@Value
public class UserDTO {

   Long id;
    String firstName;
    String lastName;
    String email;
    Address address;
    List <TripDTO> purchasedTrips;

    public static UserDTO fromUser(User user) {
        return new UserDTO(
               user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getAddress(),
                user.getPurchasedTrips()
        );
    }

}
