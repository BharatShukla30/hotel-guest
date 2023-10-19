package com.hotel.management.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

    @GetMapping("/login")
    public String test(){
        return "Access Gained..";
    }

    @PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping("/private")
    public String privateUrl(){
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getAuthorities());
        return "Private Resource";
    }
}
