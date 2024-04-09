package home_work_2.loops;

public class LoopsTask1_1_Recursion {
    public static void main(String[] args) {
        String str = args[0];
        int givenValue = Integer.parseInt(str, 10);
        System.out.println("Заданное число= " + givenValue);
        System.out.println("Факториал заданного числа= " + factorial(givenValue));
    }
    public static int factorial(int n){
        if (n == 1){
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}