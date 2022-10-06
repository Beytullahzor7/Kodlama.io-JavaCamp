package business;

import core.Logger;
import dataAccess.ProductDao;
import entities.Product;
public class ProductManager {
    private final ProductDao productDao;
    private final Logger[] loggers;
    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    // Business Rules
    public void add(Product product) throws Exception {
        if (product.getUnitPrice() < 10) {
            throw new Exception("Urun Fiyati 10 dan kucuk olamaz");
        }
        productDao.add(product);

        for (Logger logger : loggers) { // [db,mail]
            logger.log(product.getName());
        }
    }
}
