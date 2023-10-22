package com.hotel.management.service.impl;

import com.hotel.management.entity.Guest;
import com.hotel.management.repository.GuestRepository;
import com.hotel.management.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GuestServiceImpl implements GuestService {

    private final GuestRepository guestRepository;
    @Autowired
    public GuestServiceImpl(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @Override
    public Guest addGuest(Guest guest) {
        return guestRepository.save(guest);
    }

    @Override
    public Optional<Guest> getByAadhaarNumber(String aadhaarNumber) {
        return guestRepository.findByAadhaarNumber(aadhaarNumber);
    }
}
