package thirdWeekHomeworks.homework3.core.logging;

public class DatabaseLogger implements ILogger {

    @Override
    public void log(String message) {
        System.out.println("Logged To Database : " + message);
    }
}
