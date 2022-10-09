package thirdWeekHomeworks.homework2.interfaces;

public class MySqlCustomerDal implements ICustomerDal {

    @Override
    public void add() {
        System.out.println("MySQL Eklendi");
    }
}
