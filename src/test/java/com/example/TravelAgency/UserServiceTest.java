package com.example.TravelAgency;

import com.example.TravelAgency.domain.user.Address;
import com.example.TravelAgency.domain.user.UserDTO;
import com.example.TravelAgency.domain.user.UserService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    UserDTO user1DTO = new UserDTO(null,"Adam","Kowalski","adamk@wp.pl",
                            new Address("Poznań","Ratajczaka","15a","61-015"));

    UserDTO user2DTO = new UserDTO(null,"Michał","Nowak","michaln@wp.pl",
            new Address("Poznań","Garbary","146","61-018"));

    @Test
    void should_add_users_to_db(){
        //given
        Long addedUser1Id = userService.addUser(user1DTO);
        Long addedUser2id = userService.addUser(user2DTO);
        //when
        Optional<UserDTO> user1FoundById = userService.getUserByID(addedUser1Id);


        assertTrue(user1FoundById.isPresent());
        assertEquals(user1FoundById.get().getId(),addedUser1Id);


        //Assertions.assertThat(user1FoundById.get().getId().equals(user1DTO));




    }

}
