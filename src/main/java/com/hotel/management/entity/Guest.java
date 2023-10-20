package com.hotel.management.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String aadhaarNumber;
    private String name;
    private String fathersName;
    private String phoneNumber;
    private String email;
    private float guestRating;
    @OneToMany(mappedBy = "guest")
    private List<Review> reviews;

}
