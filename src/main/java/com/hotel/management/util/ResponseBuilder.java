package com.hotel.management.util;

import com.hotel.management.model.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseBuilder {

    public static ResponseEntity<Map<Object, Object>> buildResponse(HttpStatus status, Object data, String message){
        Map<Object, Object> response = new HashMap<>();
        response.put(ApiResponse.status, status.value());
        response.put(ApiResponse.data, data);
        response.put(ApiResponse.message, message);
        return new ResponseEntity<>(response, status);
    }
}
