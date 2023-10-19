package com.hotel.management.service;

import com.hotel.management.entity.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface GuestService {
    //private final GuestRepository guestRepository;
//    private final GuestDao guestDao;

//    @Autowired
//    public GuestService(GuestDao guestDao) {
//        //this.guestRepository = guestRepository;
//        this.guestDao = guestDao;
//    }

    public ResponseEntity<String> addGuest(Guest guest);
    public Optional<Guest> getGuestByAdhar(String adharCardNumber);

//    public int createGuestTable();


}

