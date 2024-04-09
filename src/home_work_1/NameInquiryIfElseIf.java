package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class NameInquiryIfElseIf {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String name = console.next();
        System.out.println(nameInquiryIfElseIf(name));
    }

    public static String nameInquiryIfElseIf(String name){
        if (Objects.equals(name, "Вася")) {
            return "Привет!" + "\n" + "Я тебя так долго ждал";
        } else if (Objects.equals(name, "Анастасия")) {
            return "Я тебя так долго ждал";
        } else {
            return "Добрый день! А вы кто?";
        }
    }
}
