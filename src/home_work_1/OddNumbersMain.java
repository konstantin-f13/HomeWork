package home_work_1;

import home_work_2.utils.SortUtils;

public class OddNumbersMain {
    public static void main(String[] args) {
        int a = randomNumberGen();
        int b = randomNumberGen();
        System.out.println("Identified odd number: " + oddNumIdentification(a, b));
    }

    public static int randomNumberGen(){
        return (int) Math.round(Math.random() * 100);
    }

    public static int oddNumIdentification(int a, int b){
        if (a % 2 == 0 && b % 2 == 0) {
            a = a + 1;
        } else if (a % 2 == 1 && b % 2 == 1){
            a = a + 1;
        }

        if (a % 2 == 1) {
            return a;
        } else return b;
    }
}