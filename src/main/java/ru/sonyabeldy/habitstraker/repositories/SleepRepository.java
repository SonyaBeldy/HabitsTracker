package ru.sonyabeldy.habitstraker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.sonyabeldy.habitstraker.models.Sleep;

import java.util.Date;
import java.util.List;

@Repository
public interface SleepRepository extends JpaRepository<Sleep, Integer> {

    List<Sleep> findByDateBetween(Date from, Date to);

    @Modifying
    @Query("update Sleep u set u.awake = :awake, u.rem = :rem, u.lightSleep = :light_sleep, u.deep_sleep =:deep_sleep  where u.id = :id")
    void updateSleep(@Param(value = "id")int id, @Param(value = "awake") int awake, @Param(value = "rem") int rem, @Param(value = "lightSleep") int lightSleep, @Param(value = "deepSleep") int deepSleep);
}
