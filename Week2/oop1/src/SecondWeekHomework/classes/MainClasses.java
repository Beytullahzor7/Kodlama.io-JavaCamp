package SecondWeekHomework.classes;

public class MainClasses {
    public static void main(String[] args) {
        // reference type
        CustomerManager customerManager1;
        CustomerManager customerManager2 = new CustomerManager();
        customerManager1 = customerManager2;

        customerManager2.add();
        customerManager2.remove();
        customerManager2.update();

        // value type
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        int[] sayilar1 = {3, 4, 5};
        int[] sayilar2 = {30, 40, 50};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);
    }
}
