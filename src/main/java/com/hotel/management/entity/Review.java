package com.hotel.management.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String stayHotel;
    private Float rating;
    private String reviewMessage;
    private Date addedAt;
    @ManyToOne
    @JsonIgnore
    private Guest guest;

}
