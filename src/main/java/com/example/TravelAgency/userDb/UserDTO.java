package com.example.TravelAgency.userDb;

import lombok.Value;


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

}
