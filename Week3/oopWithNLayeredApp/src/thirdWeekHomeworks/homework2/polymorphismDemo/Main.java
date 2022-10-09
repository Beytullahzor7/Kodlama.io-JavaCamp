package thirdWeekHomeworks.homework2.polymorphismDemo;

public class Main {
    public static void main(String[] args) {
        BaseLogger[] loggers = {new DatabaseLogger(), new FileLogger(), new EmailLogger()};

        for (BaseLogger logger : loggers) {
            logger.log("Logged");
        }

        System.out.println("--------------------");

        //CustomerManager customerManager = new CustomerManager(new EmailLogger());
        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
    }
}
