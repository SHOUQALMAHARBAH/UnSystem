package com.mays;

import java.util.List;
import java.time.LocalTime;

class Course {
    String name;
    int credits;
    Faculty faculty;
    List<Schedule> schedules;
    List<Course> prerequisites;

    public Course(String name, int credits, Faculty faculty, List<Schedule> schedules , List<Course> prerequisites) {
        this.name = name;
        this.credits = credits;
        this.faculty = faculty;
        this.schedules = schedules;
        this.prerequisites = prerequisites;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public boolean hasClassConflict(Course otherCourse) {
        return this.schedules.stream()
                .anyMatch(thisSchedule ->
                        otherCourse.getSchedules().stream()
                                .anyMatch(otherSchedule ->
                                        thisSchedule.getDay().equalsIgnoreCase(otherSchedule.getDay()) &&
                                                doTimeRangesOverlap(thisSchedule.getStartTime(), thisSchedule.getEndTime(),
                                                        otherSchedule.getStartTime(), otherSchedule.getEndTime())
                                )
                );
    }

    private boolean doTimeRangesOverlap(LocalTime start1, LocalTime end1, LocalTime start2, LocalTime end2) {
        return !end1.isBefore(start2) && !end2.isBefore(start1);
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", credits=" + credits +
                ", faculty=" + faculty +
                ", schedules=" + schedules +
                ", prerequisites=" + prerequisites +
                '}';
    }
}
