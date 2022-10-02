package lesson4;

public class Task4 {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 1;
        int multiplicationResult;
        String multiplicationTable = "";

        while (firstNumber <= 10) {
            while (secondNumber <= 10) {
                multiplicationTable += firstNumber + " x ";
                multiplicationTable += secondNumber + " = ";
                multiplicationResult = firstNumber * secondNumber;
                multiplicationTable += multiplicationResult + "\n";
                secondNumber++;
            }
            multiplicationTable += "\n";
            secondNumber = 1;
            firstNumber++;
        }

        System.out.println(multiplicationTable);
    }
}
