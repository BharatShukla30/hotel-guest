package com.hotel.management.controller;

import com.hotel.management.entity.Guest;
import com.hotel.management.entity.Review;
import com.hotel.management.entity.User;
import com.hotel.management.service.GuestService;
import com.hotel.management.service.ReviewService;
import com.hotel.management.util.ResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/review")
public class ReviewController {

    private final ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping("/add/{guestId}")
    public ResponseEntity<Map<Object, Object>> addReview(@PathVariable Long guestId, @RequestBody Review review){
        Review newReview = reviewService.addReview(review, guestId);
        return ResponseBuilder.buildResponse(HttpStatus.OK, newReview, "Review Added successfully");
    }

}
