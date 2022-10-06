package dataAccess;

import entities.Product;

public class HibernateProductDao implements ProductDao {
    @Override
    public void add(Product product) {
        System.out.println("Hibernate ile Veritabanina Eklendi " + product.getName());
    }
}
