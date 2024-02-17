package home_work_1;

import java.util.Scanner;

public class BitwiseOperationsMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the first BYTE number");
        byte a = console.nextByte(); // a = 56 = 0011_1000
        System.out.println("The first number is: " + a + "\n" + "Enter the second BYTE number");
        byte b = console.nextByte();// b = -100 = 1001_1100
        System.out.println("The second number is: " + b);
        int c = a & b;
        System.out.println("Result of bitwise AND operation: " + c);// bitwise result c = 0001_1000
        int d = a | b;
        System.out.println("Result of bitwise OR operation: " + d);// bitwise result c = 1011_1100
    }
}