package home_work_1;

import java.util.Scanner;

public class LetterOrSymbolMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = console.nextInt();
        System.out.println("Введённое число=" + a);
        System.out.println(methodLetterOrSymbol(a));
    }

    public static String methodLetterOrSymbol(int a){
        if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {
            return "Это буква " + (char)a;
        } else {
            return "Это не буква, а символ " + (char)a;
        }
    }
}
