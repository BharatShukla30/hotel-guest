package com.hotel.management.controller;

import com.hotel.management.entity.Guest;
import com.hotel.management.entity.Review;
import com.hotel.management.service.GuestService;
import com.hotel.management.service.ReviewService;
import com.hotel.management.util.ResponseBuilder;
import org.postgresql.util.PSQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/guest")
public class GuestController {
    private final GuestService guestService;


    @Autowired
    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }

    @PostMapping("/add")
    public ResponseEntity<Map<Object, Object>> createGuest(@RequestBody Guest guest){
        try{
            Guest newGuest = guestService.addGuest(guest);
            return ResponseBuilder.buildResponse(HttpStatus.OK, newGuest, "Guest Added Successfully");
        }
        catch (RuntimeException e){
            return ResponseBuilder.buildResponse(HttpStatus.INTERNAL_SERVER_ERROR, null, e.getMessage());
        }

    }

    @GetMapping("/{aadhaarNumber}")
    public ResponseEntity<Map<Object, Object>> getGuestByAadhaarNumber(@PathVariable String aadhaarNumber){
        Optional<Guest> guest = guestService.getByAadhaarNumber(aadhaarNumber);
        if(guest.isPresent()){
            return ResponseBuilder.buildResponse(HttpStatus.OK, guest, "Guest Data Fetched");
        }
        return ResponseBuilder.buildResponse(HttpStatus.NOT_FOUND, null, "Guest does not exist");
    }

}


