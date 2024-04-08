package home_work_1;

import java.util.Scanner;

public class DivisibilityCheckMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a, b;
        System.out.println("You're gonna specify 2 INT UNEQUAL non-zero numbers");
        System.out.println("Enter the 1st number");
        a = console.nextInt();
        System.out.println("The 1st number is: " + a + "\n" +"Enter the 2nd number");
        b = console.nextInt();
        System.out.println("The 2nd number is: " + b);
        System.out.println(divisibilityCheck(a, b));
        System.out.println("The remainder is " + returnRemainder(a, b));
        System.out.println("The quotient is " + returnQuotient(a, b));
    }

    public static String divisibilityCheck(int a, int b){
        if (a % b == 0){
            return "Первое число без остатка делится на второе";
        } else return "Первое число не делится без остатка на второе";

    }

    public static double returnRemainder(int a, int b){
        if (!(a % b == 0)){
            return a % b;
        } else return 0;
    }

    public static double returnQuotient(int a, int b){
        return a / b;
    }
}

