package com.example.TravelAgency.userDb;

import lombok.Data;
import lombok.Value;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
public class BaseEntity {
    @Id
    @GeneratedValue
    private Long id;
    private boolean deleted;

}
