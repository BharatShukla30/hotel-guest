package com.hotel.management.security;

import org.springframework.stereotype.Component;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import java.util.Date;

@Component
public class JwtUtil {

    private final String SECRET_KEY = "dKcR4DcZgOXSXDYT3S5wECvkFmQ8h/N4bk3LSjq1PqU=hkHGKUGUgukfgkugfgfGKUGkugkGKfkgfkGKUGKugkuGUKgkGKU";

    public String getUsernameFromToken(String token){
        return getAllClaimsFromToken(token).getSubject();
    }

    public Date getExpirationDateFromToken(String token){
        return getAllClaimsFromToken(token).getExpiration();

    }

    private Claims getAllClaimsFromToken(String token){
        return Jwts.parserBuilder().setSigningKey(SECRET_KEY.getBytes()).build().parseClaimsJws(token).getBody();
    }

    public Boolean isTokenExpired(String token){
        Date expiration = getExpirationDateFromToken(token);
        return expiration.before(new Date());
    }

}
