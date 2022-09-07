package lesson2;

public class Task4 {
    public static void main(String[] args) {
        int n = 347;
        int sumOfDigits = (n % 10) + (n / 10) % 10 + (n / 100) % 10;
        System.out.println(sumOfDigits);
    }
}