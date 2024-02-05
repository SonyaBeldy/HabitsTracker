package ru.sonyabeldy.habitstraker.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.Interval;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "sleep_duration")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
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

    @Column(name = "awake")
    private Integer awake;

    @Column(name = "rem")
    private Integer rem;

    @Column(name = "light_sleep")
    private Integer lightSleep;

    @Column(name = "deep_sleep")
    private Integer deep_sleep;

}
