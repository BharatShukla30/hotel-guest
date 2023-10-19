package com.hotel.management.service;

import com.hotel.management.entity.Guest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GuestServiceImpl implements GuestService{

    public ResponseEntity<String> addGuest(Guest guest) {
        return (ResponseEntity<String>) ResponseEntity.ok();
    }

    public Optional<Guest> getGuestByAdhar(String adharCardNumber) {
        return null;
    }

}
