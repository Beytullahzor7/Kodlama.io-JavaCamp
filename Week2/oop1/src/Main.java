public class Main {
    public static void main(String[] args) {
        String message = "Vade Orani";

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(4);
        product2.setUnitPrice(4500);
        product2.setUnitsInStock(6);
        product2.setImageUrl("image2.jpg");


        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(9);
        product3.setUnitPrice(5500);
        product3.setUnitsInStock(2);
        product3.setImageUrl("image3.jpg");


        Product[] products = {product1, product2, product3};

        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "/<li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("0543");
        individualCustomer.setCustomerNumber("123");
        individualCustomer.setFirstName("Beytullah");
        individualCustomer.setLastName("Zor");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCustomerNumber("54321");
        corporateCustomer.setPhone("0555");
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setTaxNumber("123456789");


    }
}
