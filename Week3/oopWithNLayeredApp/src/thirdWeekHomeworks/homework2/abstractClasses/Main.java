package thirdWeekHomeworks.homework2.abstractClasses;

public class Main {
    public static void main(String[] args) {

        GameCalculator[] gameCalculators = {new KidsGameCalculator(), new ManGameCalculator(), new WomanGameCalculator()};

        for (GameCalculator calculator : gameCalculators) {
            calculator.hesapla();
        }
    }
}
