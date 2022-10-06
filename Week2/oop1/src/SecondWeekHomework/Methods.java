package SecondWeekHomework;

public class Methods {
    public static void main(String[] args) {
        sayiBulmaca();
    }

    // camelCasing
    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 8, 9, 0};
        int aranacak = 6;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            mesajVer("Sayi Mevcuttur: " + aranacak);
        } else {
            mesajVer("Sayi Mevcuttur: " + aranacak);
        }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}
