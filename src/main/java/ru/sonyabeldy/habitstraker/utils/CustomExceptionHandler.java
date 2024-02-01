package ru.sonyabeldy.habitstraker.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(DateParseException.class)
    public ResponseEntity<String> dateParseHandler(DateParseException e) {
        return new ResponseEntity<>("{\"message\": \"Wrong date format!\"}", HttpStatus.BAD_REQUEST);
    }
}
