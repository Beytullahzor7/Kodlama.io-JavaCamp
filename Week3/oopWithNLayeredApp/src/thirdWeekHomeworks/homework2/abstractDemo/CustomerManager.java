package thirdWeekHomeworks.homework2.abstractDemo;

public class CustomerManager {
    private BaseDatabaseManager manager;

    public CustomerManager(BaseDatabaseManager manager) {
        this.manager = manager;
    }

    public void getCustomer() {
        manager.getData();
    }
}
