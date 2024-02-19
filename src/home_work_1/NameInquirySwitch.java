package home_work_1;

import java.util.Scanner;

public class NameInquirySwitch {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String name = console.next();
        switch (name) {
            case "Вася":
                System.out.println("Привет!" + "\n" + "Я тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день! А вы кто?");
        }
    }
}
