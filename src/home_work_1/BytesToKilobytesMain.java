package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class BytesToKilobytesMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        int a = console.nextInt();
        System.out.println("Введите b для перевода числа в байты или k для перевода в килобайты");
        console.nextLine();//очистка буфера ввода
        String str = console.next();
        System.out.println(methodBytesToKilobytes(a, str));

    }

    public static String methodBytesToKilobytes(int a, String str){
        String b = "b";
        String k = "k";
        if (Objects.equals(str, b)) {
            int result = a * 1024;
            return "Результат перевода числа в байты: " + result;
        } else if (Objects.equals(str, k)) {
            int result = a / 1024;
            return "Результат перевода числа в килобайты: " + result;
        } else {
            return "Введенные данные не соответствуют b или k.";
        }
    }
}
