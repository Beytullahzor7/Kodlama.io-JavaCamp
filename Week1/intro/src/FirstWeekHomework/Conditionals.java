package FirstWeekHomework;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number < 20) {
            System.out.println("Sayi 20 den kucuktur");
        } else if (number == 20) {
            System.out.println("Sayi 20 ye esittir");
        } else {
            System.out.println("Sayi 20 den buyuktur");
        }
    }
}
