package thirdWeekHomeworks.homework2.overriding;

public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] managers = {new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};

        for (BaseKrediManager manager : managers) {
            System.out.println(manager.hesapla(150));
        }
    }
}
