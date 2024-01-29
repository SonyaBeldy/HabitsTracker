package ru.sonyabeldy.habitstraker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sonyabeldy.habitstraker.models.SleepDuration;
import ru.sonyabeldy.habitstraker.repositories.SleepDurationRepository;

import java.util.Date;
import java.util.List;

@Service
public class SleepDurationService {

    private final SleepDurationRepository repository;

    @Autowired
    public SleepDurationService(SleepDurationRepository repository) {
        this.repository = repository;
    }

    public List<SleepDuration> findByDateBetween(Date from, Date to) {
        return repository.findByDateBetween(from, to);
    }

}
