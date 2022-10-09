package thirdWeekHomeworks.homework2.staticDemo;

public class ProductValidator {
    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        }
        return false;
    }
}
