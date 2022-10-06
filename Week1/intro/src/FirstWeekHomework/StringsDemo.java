package FirstWeekHomework;

import java.util.Arrays;

public class StringsDemo {
    public static void main(String[] args) {
        String message = "Bugun Hava Cok Guzel";

        System.out.println("Eleman Sayisi: " + message.length());
        System.out.println("5. Eleman : " + message.charAt(4));
        System.out.println(message.concat(" Yasasin"));
        System.out.println(message.startsWith("B"));
        System.out.println(message.startsWith("C"));
        System.out.println(message.endsWith("l"));
        System.out.println(message.indexOf("a"));
        System.out.println(message.lastIndexOf("a"));


        String newMessage = message.replace(" ", "-");
        System.out.println(newMessage);
        System.out.println(newMessage.substring(5));

        String[] strArray = new String[4];
        int temp = 0;
        for (String i : message.split(" ")) {
            strArray[temp] = i.toUpperCase();
            temp++;
        }
        System.out.println(Arrays.toString(strArray));
    }
}
