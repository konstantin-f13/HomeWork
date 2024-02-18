package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class NameInquiryIfElse {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String name = console.next();
        String str1 = "Вася";
        String str2 = "Анастасия";
        if (Objects.equals(name, str1)) {
            System.out.println("Привет!" + "\n" + "Я тебя так долго ждал");
        } else {
            if (Objects.equals(name, str2)) {
                System.out.println("Я тебя так долго ждал");
            } else {
                System.out.println("Добрый день! А вы кто?");
            }
        }
    }
}
