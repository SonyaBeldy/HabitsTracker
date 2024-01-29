package ru.sonyabeldy.habitstraker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.sonyabeldy.habitstraker.models.SleepDuration;
import ru.sonyabeldy.habitstraker.services.SleepDurationService;

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
    public List<SleepDuration> findByDateBetween(@RequestParam String from, @RequestParam String to) {
        try {
            return sleepDurationService.findByDateBetween(castToDate(from), castToDate(to));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    //TODO: from String to Date cast, remove this method to class Utils
    private Date castToDate(String date) throws ParseException {
        return new SimpleDateFormat("yyyy-mm-dd", Locale.ENGLISH).parse(date);
    }
//?from=2024-01-01&to=2024-01-03
}
