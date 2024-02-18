package home_work_1;

import java.util.Scanner;

public class LeapYearCheckMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите год целым числом");
        int year = console.nextInt();
        System.out.println("Введен год: " + year);
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Год не столетие, год високосный.");
        } else if (year % 4 == 0 && year % 100 == 0) {
            if (year % 400 != 0) {
                System.out.println("Год столетие, но не високосный.");
            } else if (year % 400 == 0) {
                System.out.println("Год столетие и високосный.");
            }
        } else {
            System.out.println("Год обычный.");
        }
    }
}
