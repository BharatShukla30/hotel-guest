package com.hotel.management.service;

import com.hotel.management.entity.Review;
import com.hotel.management.entity.User;

import java.util.Optional;

public interface ReviewService {

    public Review addReview(Review review, Long guestId);



}
