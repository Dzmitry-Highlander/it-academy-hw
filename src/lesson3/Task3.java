package lesson3;

public class Task3 {
    public static void main(String[] args) {
        int timeOfDay = 19;
        String helloPhrase;

        if (timeOfDay >= 0 && timeOfDay <= 6) {
            helloPhrase = "Доброй ночи!";
        } else if (timeOfDay >= 7 && timeOfDay <= 12) {
            helloPhrase = "Доброе утро!";
        } else if (timeOfDay >= 13 && timeOfDay <= 18) {
            helloPhrase = "Добрый день!";
        } else if (timeOfDay >= 19 && timeOfDay <= 23) {
            helloPhrase = "Добрый вечер!";
        } else {
            helloPhrase = "Нет такого времени суток";
        }

        System.out.println(helloPhrase);
    }
}
