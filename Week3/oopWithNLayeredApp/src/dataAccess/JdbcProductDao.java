package dataAccess;

import entities.Product;
public class JdbcProductDao implements ProductDao {
    // Sadece ve sadece db erisim kodlari buraya yazilir
    @Override
    public void add(Product product) {
        System.out.println("JDB ile Veritabanina Eklendi " + product.getName());
    }
}
