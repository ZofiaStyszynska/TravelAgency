package com.example.TravelAgency.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository <User,Long>{

List<User> findUserByLastName(String lastName);
Optional<User> findUserByEmail(String email);


}
