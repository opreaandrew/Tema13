package ro.fasttrackit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DailyPlanner {
    List<DaySchedule> schedules;

    public DailyPlanner(List<DaySchedule> schedules) {
        this.schedules = new ArrayList<>(schedules);
    }

    public void addActivity(String day, String activity){       // if the activity is null throw a custom UNCHECKED exception: NoActivityException
      if(activity == null){
//          throw NoActivityException();
      }
      schedules.add(new DaySchedule(Day.))
    }

    public void removeActivity(String day, String activity){    //  if the activity doesn't exist throw the custom UNCHECKED exception: NoActivityException

    }

    public List<String> getActivities(String day){
        return new ArrayList<>();
    }

    public Map<Day, List<String>> endPlanning(){                // If there's a day without activities throw a custom CHECKED exception : NoActivitiesForDayException

        return new HashMap<>();
    }
}
