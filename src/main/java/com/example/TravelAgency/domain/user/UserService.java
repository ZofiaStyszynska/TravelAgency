package com.example.TravelAgency.domain.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDTO> getAllUsers(){
        return userRepository.findAll().stream()
                .map(UserDTO::fromUser)
                .collect(Collectors.toList());
    }

    public Optional<UserDTO> getUserByID(Long id) {
        return userRepository.findById(id)
                .map(UserDTO::fromUser);
    }

    public List<UserDTO> getUsersByLastName(String lastName) {
        return userRepository.findUserByLastName(lastName).stream()
                .map(UserDTO::fromUser)
                .collect(Collectors.toList());
    }

    public Long addUser (UserDTO userDTO){
        final User user = userRepository.save(new User(
                userDTO.getFirstName(),
                userDTO.getLastName(),
                userDTO.getEmail(),
                userDTO.getAddress(),new ArrayList<>()));
        return user.getId();
    }

    public Long deleteUser (Long id){
        final Optional<User> optionalUser = userRepository.findById(id);
        optionalUser.ifPresent(user -> user.setDeleted(true));
        return optionalUser.get().getId();

    }



}
