package lesson4;

public class Task2 {
    public static void main(String[] args) {
        int numbersToOut = 0;
        String numbers0To10 = "";

        while (numbersToOut <= 10) {
            numbers0To10 += numbersToOut + " ";
            numbersToOut++;
        }

        System.out.println(numbers0To10);
    }
}
