package home_work_1;

import java.util.Scanner;

public class MediumNumberAmongThreeMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        byte a, b, c;
        System.out.println("You're gonna specify 3 BYTE unequal numbers");
        System.out.println("Enter the 1st number");
        a = console.nextByte();
        System.out.println("The 1st number is: " + a + "\n" +"Enter the 2nd number");
        b = console.nextByte();
        System.out.println("The 2nd number is: " + b + "\n" +"Enter the 3rd number");
        c = console.nextByte();
        System.out.println("The 3rd number is: " + c);
        System.out.println("Number " + mediumNumberAmongThree(a, b, c) + " is the medium number");
    }

    public static byte mediumNumberAmongThree(byte a, byte b, byte c){
        if ((a > b && a < c) || (a < b && a > c)) {
            return a;
        } else if ((b > a && b < c) || (b < a && b > c)) {
            return b;
        } else {
            return c;
        }
    }

}
