package home_work_1;

import java.util.Scanner;

public class LeapYearCheckMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите год целым числом");
        int year = console.nextInt();
        System.out.println("Введен год: " + year);
        System.out.println(leapYearCheck(year));

    }

    public static String leapYearCheck(int year){
        if (year % 4 == 0 && year % 100 != 0) {
            return "Год не столетие, год високосный.";
        } else if (year % 4 == 0 && year % 100 == 0) {
            if (year % 400 != 0) {
                return "Год столетие, но не високосный.";
            } else if (year % 400 == 0) {
                return "Год столетие и високосный.";
            }
        }
        return "Год обычный.";
    }
}