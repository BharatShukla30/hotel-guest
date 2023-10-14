package com.hotel.management.controller;

import com.hotel.management.model.Guest;
import com.hotel.management.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/guests")
public class GuestController {
    private final GuestService guestService;

    @Autowired
    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }

    @PostMapping("/add")
    public ResponseEntity<String> addGuest(@RequestBody Guest guest) {
        return guestService.addGuest(guest);
    }

    @GetMapping("/get-by-adhar/{adharCardNumber}")
    public ResponseEntity<?> getGuestByAdhar(@PathVariable String adharCardNumber) {
        Optional<Guest> guestOptional = guestService.getGuestByAdhar(adharCardNumber);
        if (guestOptional.isPresent()) {
            Guest guest = guestOptional.get();
            return ResponseEntity.ok(guest.getGuestRating());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

//    @GetMapping("/create-table")
//    public ResponseEntity<Integer> createTableDb(){
//        Integer intObj = (guestService.createGuestTable());
//        return ResponseEntity.ok(intObj);
//    }
}


