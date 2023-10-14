package com.hotel.management.service;

import com.hotel.management.dao.GuestDao;
import com.hotel.management.model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GuestService {
    //private final GuestRepository guestRepository;
    private final GuestDao guestDao;

    @Autowired
    public GuestService(GuestDao guestDao) {
        //this.guestRepository = guestRepository;
        this.guestDao = guestDao;
    }

//    public ResponseEntity<String> addGuest(Guest guest) {
//        // Business logic here, e.g., check if the guest is a "bad guest"
//        if (guest.getGuestRating() <= 2) {
//            //guestRepository.save(guest);
//            return ResponseEntity.ok("Guest added successfully.");
//        } else {
//            return ResponseEntity.badRequest().body("Only bad guests are allowed.");
//        }
//    }

//    public Optional<Guest> getGuestByAdhar(String adharCardNumber) {
//        return guestRepository.findByAdharCardNumber(adharCardNumber);
//    }

    public int createGuestTable(){
        return guestDao.createTable();
    }

    public ResponseEntity<String> addGuest(Guest guest) {
        return (ResponseEntity<String>) ResponseEntity.ok();
    }

    public Optional<Guest> getGuestByAdhar(String adharCardNumber) {
        return null;
    }
}

