package com.mays;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.*;

public class Schedule {
   String day;
   LocalTime startTime;
   LocalTime endTime;


    public Schedule(String day, LocalTime startTime, LocalTime endTime) {
        if (isValidDay(day)) {
            this.day = day;
            this.startTime = startTime;
            this.endTime = endTime;
        } else {
            throw new IllegalArgumentException("Invalid day. Day must be from Monday to Friday.");
        }
    }

    private boolean isValidDay(String day) {
       
        String[] validDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        return Arrays.stream(validDays).anyMatch(validDay -> validDay.equalsIgnoreCase(day));
    }

    public String getDay() {
        return day;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

   
}


