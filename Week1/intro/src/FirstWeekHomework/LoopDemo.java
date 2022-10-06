package FirstWeekHomework;

public class LoopDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.format("i nin degeri : %s \n", i);
        }

        System.out.println("************************************");

        for (int i = 2; i <= 20; i += 3) {
            System.out.println(i);
        }
        System.out.println("For Dongusu Bitti");

        System.out.println("************************************");

        int number = 1;

        while (number < 10) {
            System.out.println(number);
            number++;
        }
        System.out.println("While Dongusu Bitti...");
        System.out.println("************************************");

        int j = 20;
        do {
            System.out.println(j);
            j++;
        } while (j < 25);
        System.out.println("Do-While Dongusu Bitti");
    }
}
