package FirstWeekHomework;

public class AsalSayi {
    public static void main(String[] args) {
        int number = 17;
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) System.out.println("Sayi Asaldir");
        else System.out.println("Sayi Asal Degildir");
    }
}
