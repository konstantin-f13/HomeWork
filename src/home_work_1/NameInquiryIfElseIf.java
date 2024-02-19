package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class NameInquiryIfElseIf {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String name = console.next();
        if (Objects.equals(name, "Вася")) {
            System.out.println("Привет!" + "\n" + "Я тебя так долго ждал");
        } else if (Objects.equals(name, "Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день! А вы кто?");
        }
    }
}
