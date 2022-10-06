package SecondWeekHomework;

import java.util.Arrays;

public class MethodsWithParameter {
    public static void main(String[] args) {
        String yeniMesaj = sehirVer();
        int sayi = topla(5, 6);
        System.out.println(sayi);

        int result = topla2(2, 3, 4, 5, 6, 8, 12);
        System.out.println("SumOfNumbers: " + result);
    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Guncellendi");
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int topla2(int... sayilar) {
        return Arrays.stream(sayilar).sum();
    }

    public static String sehirVer() {
        return "Ankara";
    }
}
