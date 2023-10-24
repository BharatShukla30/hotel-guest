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
    @Column(unique = true, nullable = false)
    private String aadhaarNumber;
    @Column(nullable = false)
    private String name;
    private String fathersName;
    @Column(unique = true)
    private String phoneNumber;
    @Column(unique = true)
    private String email;

    @OneToMany(mappedBy = "guest")
    private List<Review> reviews;

}
