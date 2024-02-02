package ru.sonyabeldy.habitstraker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.sonyabeldy.habitstraker.models.SleepDuration;
import ru.sonyabeldy.habitstraker.services.SleepDurationService;
import ru.sonyabeldy.habitstraker.utils.DateParseException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/sleep")
public class SleepDurationController {

    private final SleepDurationService sleepDurationService;

    @Autowired
    public SleepDurationController(SleepDurationService sleepDurationService) {
        this.sleepDurationService = sleepDurationService;
    }

    @GetMapping()
    public List<SleepDuration> findByDateBetween(@RequestParam String from, @RequestParam String to) throws DateParseException {
        return sleepDurationService.findByDateBetween(castToDate(from), castToDate(to));
    }

    @PostMapping()
    public ResponseEntity<HttpStatus> save(@RequestBody SleepDuration sleepDuration) {
        sleepDurationService.save(sleepDuration);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    //TODO: from String to Date cast, remove this method to class Utils
    private Date castToDate(String date) throws DateParseException {
        try {
            return new SimpleDateFormat("yyyy-mm-dd", Locale.ENGLISH).parse(date);
        } catch (ParseException e) {
            throw new DateParseException();
        }
    }
}
