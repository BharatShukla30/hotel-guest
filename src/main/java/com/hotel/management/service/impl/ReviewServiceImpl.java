package com.hotel.management.service.impl;

import com.hotel.management.entity.Guest;
import com.hotel.management.entity.Review;
import com.hotel.management.entity.User;
import com.hotel.management.repository.GuestRepository;
import com.hotel.management.repository.ReviewRepository;
import com.hotel.management.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;
    private final GuestRepository guestRepository;
    @Autowired
    public ReviewServiceImpl(ReviewRepository reviewRepository, GuestRepository guestRepository) {
        this.reviewRepository = reviewRepository;
        this.guestRepository = guestRepository;
    }

    @Override
    public Review addReview(Review review, Long guestId) {
        review.setAddedAt(new Date());
        Guest guest = guestRepository.findById(guestId).orElse(null);
        review.setGuest(guest);
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        review.setStayHotel(user.getHotelName());
        return reviewRepository.save(review);
    }
}
