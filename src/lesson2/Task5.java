package lesson2;

public class Task5 {
    public static void main(String[] args) {
        var number = 7.33;
        int check = (int) number;
        if ((number - check) > 0) {
            System.out.println("Число имеет вещественную часть");
        } else {
            System.out.println("Число не имеет вещественную часть");
        }
    }
}