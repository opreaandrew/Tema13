package ro.fasttrackit;

import ro.fasttrackit.planner.*;
import ro.fasttrackit.exceptions.*;

import java.util.Scanner;

public class BeautifulUI {

    public void start() {

        DailyPlanner planner = new DailyPlanner();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1) Add an activity");
            System.out.println("2) Remove an activity");
            System.out.println("3) List all activities");
            System.out.println("4) End planning");
            System.out.print("Enter your choice (1/2/3/4): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the day: ");
                    String dayInput = scanner.nextLine();
                    Day day = Day.valueOf(dayInput.toUpperCase());
                    System.out.print("Enter the activity: ");
                    String activity = scanner.nextLine();
                    planner.addActivity(day, activity);
                    break;
                case 2:
                    System.out.print("Enter the day: ");
                    String dayInput2 = scanner.nextLine();
                    Day day2 = Day.valueOf(dayInput2.toUpperCase());
                    System.out.print("Enter the activity to remove: ");
                    String activity2 = scanner.nextLine();
                    planner.removeActivity(day2, activity2);
                    break;
                case 3:
                    System.out.print("Enter the day: ");
                    String dayInput3 = scanner.nextLine();
                    Day day3 = Day.valueOf(dayInput3.toUpperCase());
                    System.out.println("Activities for " + day3 + ":");
                    System.out.println(planner.getActivities(day3));
                    break;
                case 4:
                    try {
                        planner.endPlanning();
                        System.out.println("Planning ended successfully.");
                    } catch (NoActivitiesForDayException e) {
                        System.err.println("NoActivitiesForDayException: " + e.getMessage());
                    }
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option (1/2/3/4).");
            }
        }
    }
}
