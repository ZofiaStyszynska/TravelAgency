package com.example.TravelAgency.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository <User,Long>{

List<User> findUserByLastName(String lastName);

User findUserById(Long id);
}
