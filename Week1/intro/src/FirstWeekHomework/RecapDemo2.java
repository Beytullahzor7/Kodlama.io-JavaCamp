package FirstWeekHomework;

import java.util.Arrays;

public class RecapDemo2 {
    public static void main(String[] args) {
        double[] myList = {1.2, 1.6, 4.3, 5.7, 3.7};
        double total = 0;

        for (double i : myList) {
            total += i;
        }
        System.out.println("Total : " + total);

        System.out.println("*****************************");

        System.out.println(Arrays.stream(myList).sum());

        System.out.println("******************************");

        double maxNumber = myList[0];
        for (double i : myList) {
            if (maxNumber < i) {
                maxNumber = i;
            }
        }
        System.out.println("Max Number is : " + maxNumber);

        System.out.println("******************************");

        Arrays.sort(myList);
        System.out.println("Max Number Of Array: " + myList[myList.length - 1]);
    }
}
