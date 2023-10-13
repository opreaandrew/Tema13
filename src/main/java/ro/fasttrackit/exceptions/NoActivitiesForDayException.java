package ro.fasttrackit.exceptions;

public class NoActivitiesForDayException extends InterruptedException{
    public NoActivitiesForDayException(String s) {
        super(s);
    }
}
