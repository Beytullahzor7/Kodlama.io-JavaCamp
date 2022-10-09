package thirdWeekHomeworks.homework2.staticDemo;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.add(new Product(1, "Laptop", 12.000));

        DatabaseHelper.Crud.update();
        DatabaseHelper.Connection.createConnection();
    }
}
