package lesson2;

public class Task5 {
    public static void main(String[] args) {
        double number = 11.7;
        int checkNumber = (int) number;
        boolean numberReal = number % checkNumber != 0;
        System.out.println(numberReal);
    }
}