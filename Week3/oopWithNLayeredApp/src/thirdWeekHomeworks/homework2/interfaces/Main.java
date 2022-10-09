package thirdWeekHomeworks.homework2.interfaces;

public class Main {
    public static void main(String[] args) {
        // Interface kendisini implemente eden classin referansini tutabilir
        // bu da bir polymorphism ornegidir

        ICustomerDal customerDal = new MySqlCustomerDal();
        ICustomerDal customerDal2 = new OracleCustomerDal();

        customerDal.add();
        customerDal2.add();

        System.out.println("----------------------------");

        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();
    }
}
