package lesson3;

public class Task1 {
    public static void main(String[] args) {
        int numberOfDay = 7;
        String nameOfDay;

        switch (numberOfDay) {
            case 1:
                nameOfDay = "Понедельник";
                break;
            case 2:
                nameOfDay = "Вторник";
                break;
            case 3:
                nameOfDay = "Среда";
                break;
            case 4:
                nameOfDay = "Четверг";
                break;
            case 5:
                nameOfDay = "Пятница";
                break;
            case 6:
                nameOfDay = "Суббота";
                break;
            case 7:
                nameOfDay = "Воскресенье";
                break;
            default:
                nameOfDay = "Нет такого дня недели";
                break;
        }

        System.out.println(nameOfDay);
    }
}
