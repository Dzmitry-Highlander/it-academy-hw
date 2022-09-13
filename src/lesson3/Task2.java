package lesson3;

public class Task2 {
    public static void main(String[] args) {
        int numberOfDay = 3;
        String nameOfDay;

        if (numberOfDay == 1) {
            nameOfDay = "Понедельник";
        } else if (numberOfDay == 2) {
            nameOfDay = "Вторник";
        } else if (numberOfDay == 3) {
            nameOfDay = "Среда";
        } else if (numberOfDay == 4) {
            nameOfDay = "Четверг";
        } else if (numberOfDay == 5) {
            nameOfDay = "Пятница";
        } else if (numberOfDay == 6) {
            nameOfDay = "Суббота";
        } else if (numberOfDay == 7) {
            nameOfDay = "Воскресенье";
        } else {
            nameOfDay = "Нет такого дня недели";
        }

        System.out.println(nameOfDay);
    }
}
