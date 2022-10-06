import business.ProductManager;
import core.DatabaseLogger;
import core.FileLogger;
import core.Logger;
import dataAccess.JdbcProductDao;
import entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {

        Product product1 = new Product(1, "Iphone 11", 15000.0);
        Logger[] loggers = {new DatabaseLogger(), new FileLogger()};

        ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
        productManager.add(product1);
    }
}
