package lesson2;

public class Task5 {
    public static void main(String[] args) {
        var number = 11.05;
        int x = (int) number;
        if ((number - x) > 0) {
            System.out.println("Число имеет вещественную часть");
        } else {
            System.out.println("Число не имеет вещественную часть");
        }
    }
}