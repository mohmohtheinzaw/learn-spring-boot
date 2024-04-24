package com.test.test.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
    public static ResponseEntity<Object> Respondser(String message,HttpStatus status,Object responseObj){
        Map<String, Object> metadata = new HashMap<>();
        metadata.put("message",message);
        metadata.put("statusCode",status.value());
        Map<String, Object> response = new HashMap<>();
        response.put("data", responseObj);
        response.put("metadata", metadata);
        return new ResponseEntity<>(response, status);
    }

    public static ResponseEntity<Object> generatePlainReturn(String message, HttpStatus status){
        Map<String, Object> metadata = new HashMap<>();
        metadata.put("message", message);
        metadata.put("statusCode", status.value());
        Map<String, Object> response = new HashMap<>();
        response.put("metadata", metadata);

        return new ResponseEntity<>(response, status);
    }
}
