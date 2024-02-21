package home_work_1;

import java.util.Arrays;

public class StringToBinaryMain {
    public static void main(String[] args) {
        System.out.println("Вывод числа 42 в двоичном виде: ");
        System.out.println(toBinaryString((byte)42));//Должно вернуть 00101010
        System.out.println("Вывод числа 15 в двоичном виде: ");
        System.out.println(toBinaryString((byte)15));//Должно вернуть 00001111
        System.out.println("Вывод числа -42 в двоичном виде: ");
        System.out.println(toBinaryString((byte)-42));//Должно вернуть 11010110
        System.out.println("Вывод числа -15 в двоичном виде: ");
        System.out.println(toBinaryString((byte)-15));//Должно вернуть 11110001
    }
    static String toBinaryString(byte number){
        String binaryValue = "";
        int quotientOfDivisionbyTwo;

        if (number <= 0) {
            quotientOfDivisionbyTwo = number + 255 + 1;
        } else {
            quotientOfDivisionbyTwo = number;
        }

        while (quotientOfDivisionbyTwo > 1) {
            binaryValue = quotientOfDivisionbyTwo % 2 + binaryValue;//adding the remainder of division by 2 (% 2) to the
            // beginning of the string value binaryValue. Thus, it won't be needed to reverse the values later

            quotientOfDivisionbyTwo = quotientOfDivisionbyTwo / 2;
        }

        binaryValue = quotientOfDivisionbyTwo + binaryValue;//adding the last quotient to the beginning of the string value

        for (int i = 0; i < 8; i++) {
            if (binaryValue.length() <= i) {
                binaryValue = 0 + binaryValue;
            }
        }

        return binaryValue;
    }
}
