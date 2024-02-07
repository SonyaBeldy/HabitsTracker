package ru.sonyabeldy.habitstraker.models;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "sleep")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Sleep {
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
