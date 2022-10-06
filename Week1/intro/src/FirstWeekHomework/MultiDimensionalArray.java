package FirstWeekHomework;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        String[][] cities = new String[3][3];

        cities[0][0] = "Ankara";
        cities[0][1] = "Samsun";
        cities[0][2] = "Izmir";
        cities[1][0] = "Istanbul";
        cities[1][1] = "Antalya";
        cities[1][2] = "Sinop";
        cities[2][0] = "Mugla";
        cities[2][1] = "Canakkale";
        cities[2][2] = "Diyarbakir";

        for (int i = 0; i < cities.length; i++) {
            System.out.println("----------------");
            for (int j = 0; j < cities.length; j++) {
                System.out.println(cities[i][j]);
            }
        }
    }
}
