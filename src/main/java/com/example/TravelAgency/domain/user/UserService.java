package com.example.TravelAgency.domain.user;

import com.example.TravelAgency.domain.trips.trip.TripDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
public class UserService {

    private final UserRepository userRepository;

    private PasswordEncoder passwordEncoder;

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
    public Optional<UserDTO> getUserByEmail(String email){
        return userRepository.findUserByEmail(email)
                .map(UserDTO::fromUser);
    }
    public Optional<UserDTO> login(String email, String password) throws UserDoesNotExistException{
        User user = userRepository.findUserByEmail(email).get();
            if (user.getPassword().equals(password)) {
                return getUserByEmail(email);
            } else throw new UserDoesNotExistException("User does not exist");
    }

    public Long addUser (UserDTO userDTO){
        final User user = userRepository.save(new User(
                userDTO.getFirstName(),
                userDTO.getLastName(),
                userDTO.getEmail(),
                new Address(userDTO.getAddress().getStreetName(),userDTO.getAddress().getHouseNumber(),
                        userDTO.getAddress().getCityName(),userDTO.getAddress().getPostalCode()),
                userDTO.getPassword(),
                Role.USER,
                new ArrayList<>()));
        return user.getId();
    }

    public Long deleteUser (Long id){
        final Optional<User> optionalUser = userRepository.findById(id);
        optionalUser.ifPresent(user -> user.setDeleted(true));
        return optionalUser.get().getId();

    }



}
