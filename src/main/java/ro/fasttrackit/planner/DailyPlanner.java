package ro.fasttrackit.planner;

import ro.fasttrackit.exceptions.NoActivitiesForDayException;
import ro.fasttrackit.exceptions.NoActivityException;

import java.util.*;

public class DailyPlanner {
    private final List<DaySchedule> schedules;

    public DailyPlanner() {
        this.schedules = new ArrayList<>();
        schedules.add(new DaySchedule(Day.MONDAY, new ArrayList<>()));
        schedules.add(new DaySchedule(Day.TUESDAY, new ArrayList<>()));
        schedules.add(new DaySchedule(Day.WEDNESDAY, new ArrayList<>()));
        schedules.add(new DaySchedule(Day.THURSDAY, new ArrayList<>()));
        schedules.add(new DaySchedule(Day.FRIDAY, new ArrayList<>()));
        schedules.add(new DaySchedule(Day.SATURDAY, new ArrayList<>()));
        schedules.add(new DaySchedule(Day.SUNDAY, new ArrayList<>()));
    }

    public void addActivity(Day day, String activity) {
        if (activity == null) {
            throw new NoActivityException("Activity cannot be null.");
        }

        for (DaySchedule schedule : schedules) {
            if (schedule.getDay() == day) {
                schedule.getActivities().add(activity);
                break;
            }
        }
    }

    public void removeActivity(Day day, String activity) {
        for (DaySchedule schedule : schedules) {
            if (schedule.getDay() == day) {
                if (schedule.getActivities().remove(activity)) {
                    return;
                } else {
                    throw new NoActivityException("Activity not found on " + day);
                }
            }
        }
        throw new NoActivityException("Day not found in the planner.");
    }

    public List<String> getActivities(Day day) {
        for (DaySchedule schedule : schedules) {
            if (schedule.getDay() == day) {
                return schedule.getActivities();
            }
        }
        throw new NoActivityException("Day not found in the planner.");
    }

    public Map<Day, List<String>> endPlanning() throws NoActivitiesForDayException {
        Map<Day, List<String>> activitiesMap = new TreeMap<>();
        for (DaySchedule schedule : schedules) {
            activitiesMap.put(schedule.getDay(), schedule.getActivities());
        }

        for (Day day : Day.values()) {
            if (activitiesMap.get(day).isEmpty()) {
                throw new NoActivitiesForDayException("No activities for " + day);
            }
        }
        return activitiesMap;
    }
}
