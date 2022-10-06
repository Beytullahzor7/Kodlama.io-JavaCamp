public class Main {
    // Main javada baslangic metodudur
    public static void main(String[] args) {

        String ortaMetin = "Ilginizi Cekebilir";
        String altMetin = "Vade Suresi";

        System.out.println(altMetin);

        int vade = 15;

        double dolarDun = 18.14;
        double dolarBugun = 18.10;

        boolean dolarDustuMu = false;

        String okYonu = "";

        if (dolarBugun < dolarDun) {
            okYonu = "down.swg";
            System.out.println(okYonu);
        } else if (dolarBugun > dolarDun) {
            okYonu = "up.swg";
            System.out.println(okYonu);
        } else {
            okYonu = "up.swg";
            System.out.println(okYonu);
        }

        String[] krediler = {"Hizli Kredi", "Maasini Halkbantan Alanlar", "Mutlu Emekli"};

        for (String i : krediler) {
            System.out.println("Kredi : " + i);
        }
    }
}
