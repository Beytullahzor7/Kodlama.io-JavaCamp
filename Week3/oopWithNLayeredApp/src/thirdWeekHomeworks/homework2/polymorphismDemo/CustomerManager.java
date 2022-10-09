package thirdWeekHomeworks.homework2.polymorphismDemo;

public class CustomerManager {
    private BaseLogger logger;
    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }
    public void add() {
        System.out.println("Musteri Eklendi");
        logger.log("Log Mesaji");
    }
}
