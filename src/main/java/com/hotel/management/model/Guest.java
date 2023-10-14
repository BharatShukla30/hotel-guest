package com.hotel.management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Entity
@Data
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String adharCardNumber;
    private String name;
    private String fathersName;
    private String phoneNumber;
    private String email;
    private int stayDuration;
    private int guestRating;
    private String reasonForRating;


}
