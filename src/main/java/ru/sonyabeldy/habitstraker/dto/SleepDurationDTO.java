package ru.sonyabeldy.habitstraker.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SleepDurationDTO {

    private Date timeTo;
    private Date timeFrom;
    private Date date;

}
