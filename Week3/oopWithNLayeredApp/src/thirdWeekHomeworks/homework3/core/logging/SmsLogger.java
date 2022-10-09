package thirdWeekHomeworks.homework3.core.logging;

public class SmsLogger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println("Logged To Sms : " + message);
    }
}
