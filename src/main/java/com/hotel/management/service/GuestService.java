package com.hotel.management.service;

import com.hotel.management.entity.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface GuestService {

    public Guest addGuest(Guest guest);

    public Optional<Guest> getByAadhaarNumber(String aadhaarNumber);




}

