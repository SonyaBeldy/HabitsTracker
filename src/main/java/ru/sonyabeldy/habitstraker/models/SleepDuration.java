package ru.sonyabeldy.habitstraker.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "sleep_duration")
public class SleepDuration {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "from")
    private Date timeFrom;

    @Column(name = "to")
    private Date timeTo;

    @Column(name = "date")
    private Date date;
}
