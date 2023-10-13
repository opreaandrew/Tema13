package ro.fasttrackit.planner;

import java.util.ArrayList;
import java.util.List;

public class DaySchedule{
    private final Day day;
    private final List<String> activities;

    public DaySchedule(Day day, List<String> activities) {
        this.day = day;
        this.activities = new ArrayList<>(activities);
    }

    public Day getDay() {
        return day;
    }

    public List<String> getActivities() {
        return activities;
    }

}
