package home_work_1;

public class OddNumbersMain {
    public static void main(String[] args) {
        int a, b;
        a = (int) Math.round(Math.random() * 100);
        b = (int) Math.round(Math.random() * 100);

        if (a % 2 == 0 && b % 2 == 0) {
            a = a + 1;
        } else if (a % 2 == 1 && b % 2 == 1){
            a = a +1;
        }

        if (a % 2 == 1) {
            System.out.println("Identified odd number: " + a);
        } else if (b % 2 ==1) {
            System.out.println("Identified odd number: " + b);
        }
    }
}
