package home_work_1;

import java.util.Scanner;

public class NameInquirySwitch {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String name = console.next();
        System.out.println(nameInquirySwitch(name));
    }

    public static String nameInquirySwitch(String name){
        switch (name) {
            case "Вася":
                return "Привет!" + "\n" + "Я тебя так долго ждал";
            case "Анастасия":
                return "Я тебя так долго ждал";
            default:
                return "Добрый день! А вы кто?";
        }
    }
}
