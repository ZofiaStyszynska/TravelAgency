package com.example.TravelAgency.controllers;

import com.example.TravelAgency.user.UserDTO;
import com.example.TravelAgency.user.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable Long id) {
        return userService.getUserByID(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{lastName}")
    public @ResponseBody
    List<UserDTO> getUsersByLastName(@PathVariable String lastName) {
        return userService.getUsersByLastName(lastName);
    }

    @GetMapping("/{lastName}")
    public ResponseEntity<List<UserDTO>> getUsersByLastName1(@PathVariable String lastName) {
        List<UserDTO> usersWithTeSameName = userService.getUsersByLastName(lastName);

        return new ResponseEntity<List<UserDTO>>(usersWithTeSameName, HttpStatus.OK);

    }
    @PostMapping
    public ResponseEntity<Void> addUser(@RequestBody UserDTO userDTO) throws URISyntaxException {
        Long userId = userService.addUser(userDTO);

        return ResponseEntity
                .created(new URI("/users/" + userId))
                .build();

    }


}
