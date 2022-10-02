package lesson4;

public class Task3 {
    public static void main(String[] args) {
        int firstFibNumber = 0;
        int secondFibNumber = 1;
        int counter = 8;
        String numbersOfFibonacci = firstFibNumber + " " + secondFibNumber + " ";

        while (counter > 0) {
            int temp;
            numbersOfFibonacci += firstFibNumber + secondFibNumber + " ";
            temp = secondFibNumber;
            secondFibNumber = firstFibNumber + secondFibNumber;
            firstFibNumber = temp;
            counter--;
        }

        System.out.println(numbersOfFibonacci);
    }
}
