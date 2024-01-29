package ru.sonyabeldy.habitstraker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sonyabeldy.habitstraker.models.SleepDuration;

import java.util.Date;
import java.util.List;

@Repository
public interface SleepDurationRepository extends JpaRepository<SleepDuration, Integer> {

    List<SleepDuration> findByDateBetween(Date from, Date to);

}
