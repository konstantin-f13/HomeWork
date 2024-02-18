package home_work_1;

import java.util.Scanner;

public class DivisibilityCheckMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a, b, c;
        System.out.println("You're gonna specify 2 INT UNEQUAL non-zero numbers");
        System.out.println("Enter the 1st number");
        a = console.nextInt();
        System.out.println("The 1st number is: " + a + "\n" +"Enter the 2nd number");
        b = console.nextInt();
        System.out.println("The 2nd number is: " + b);
        if (a % b == 0) {
            System.out.println("The 1st number is divisible by the 2nd without a remainder.");
        } else {
            c = a % b;
            System.out.println("The 1st number is not divisible by the 2nd without a remainder.");
            System.out.println("The remainder of the division is " + c);
        }
        System.out.println("The quotient obtained as a result of division is " + a / b);
    }
}
