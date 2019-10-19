package ru.itpark;

public class Switch {
    public static void main(String[] args) {
        String day = "Пн";
        boolean isWorkDay;

        switch (day.toUpperCase()) {
            case "ПН":
                System.out.println("День тяжелый");
                isWorkDay = true;
                break;
            case "ВТ":
                isWorkDay = true;
                break;
            default:
                isWorkDay = false;
                break;
        }
        System.out.println(isWorkDay);
    }
}
