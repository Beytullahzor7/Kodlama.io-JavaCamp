package FirstWeekHomework;

public class ArraysDemo {
    public static void main(String[] args) {
        String[] students = new String[3];
        students[0] = "Engin";
        students[1] = "Derin";
        students[2] = "Salih";

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("************************");

        for (String i : students) {
            System.out.println(i);
        }
    }
}
