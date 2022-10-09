package thirdWeekHomeworks.homework2.abstractDemo;

public class Main {
    public static void main(String[] args) {
        CustomerManager manager = new CustomerManager(new SqlServerDatabaseManager());
        CustomerManager manager2 = new CustomerManager(new OracleDatabaseManager());
        CustomerManager manager3 = new CustomerManager(new MySqlDatabaseManager());

        manager.getCustomer();
        manager2.getCustomer();
        manager3.getCustomer();
    }
}
