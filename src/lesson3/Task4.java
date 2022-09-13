package lesson3;

public class Task4 {
    public static void main(String[] args) {
        int timeOfDay = 3;
        String helloPhrase;

        switch (timeOfDay) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                helloPhrase = "Доброй ночи!";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                helloPhrase = "Доброе утро!";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                helloPhrase = "Добрый день!";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                helloPhrase = "Добрый вечер!";
                break;
            default:
                helloPhrase = "Нет такого времени суток!";
                break;
        }

        System.out.println(helloPhrase);
    }
}
