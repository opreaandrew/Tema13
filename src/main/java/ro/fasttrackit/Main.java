package ro.fasttrackit;

import ro.fasttrackit.exceptions.NoActivitiesForDayException;
import ro.fasttrackit.planner.DailyPlanner;
import ro.fasttrackit.planner.Day;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        BeautifulUI beautifulUI = new BeautifulUI();
        beautifulUI.start();

//        DailyPlanner planner = new DailyPlanner();
//
//        // Adding
//        System.out.println("Testing Adding");
//        planner.addActivity(Day.MONDAY, "Go for a walk");
//        planner.addActivity(Day.MONDAY, "Read a book");
//        planner.addActivity(Day.MONDAY, "Cook");
//        planner.addActivity(Day.MONDAY, "Practice a hobby");
//        // Getting
//        System.out.println("\nTesting Gettin'");
//        System.out.println(planner.getActivities(Day.MONDAY));
//
//        // Removing
//        System.out.println("\nTesting Removing");
//        planner.removeActivity(Day.MONDAY, "Read a book");
//        System.out.println(planner.getActivities(Day.MONDAY));
//
//        // Ending Planning
//        System.out.println("\nTesting the end of time");
//        planner.addActivity(Day.TUESDAY, "Go for a walk");
//        planner.addActivity(Day.WEDNESDAY, "Go for a walk");
//        planner.addActivity(Day.THURSDAY, "Go for a walk");
//        planner.addActivity(Day.FRIDAY, "Go for a walk");
//        planner.addActivity(Day.SATURDAY, "Go for a walk");
////        planner.addActivity(Day.SUNDAY, "Go for a walk");
//        try {
//            Map<Day, List<String>> activitiesMap = planner.endPlanning();
//            System.out.println(activitiesMap);
//        } catch (NoActivitiesForDayException e) {
//            System.err.println("Shit's broken dude: " + e);
//        }
    }
}