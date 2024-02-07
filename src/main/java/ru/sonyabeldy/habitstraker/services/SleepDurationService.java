package ru.sonyabeldy.habitstraker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sonyabeldy.habitstraker.models.Sleep;
import ru.sonyabeldy.habitstraker.repositories.SleepRepository;

import java.util.Date;
import java.util.List;

@Service
public class SleepDurationService {

    private final SleepRepository repository;

    @Autowired
    public SleepDurationService(SleepRepository repository) {
        this.repository = repository;
    }

    public List<Sleep> findByDateBetween(Date from, Date to) {
        return repository.findByDateBetween(from, to);
    }

    public void save(Sleep sleepDuration) {
        repository.save(sleepDuration);
    }

    public void updateSleepPhases(int id, int awake, int rem, int light_sleep, int deep_sleep) {
        repository.updateSleep(id, awake, rem, light_sleep, deep_sleep);
    }
}
