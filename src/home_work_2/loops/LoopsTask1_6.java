package home_work_2.loops;

public class LoopsTask1_6 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j <= 5 ; j++) {
                System.out.print(j + " x " + i + " = " + i * j + "\t  " + "| ");
            }
            System.out.println("\b\b");
        }

        int count = 0;

        while (count <= 58) {
            System.out.print("_");
            count++;
        }
        System.out.println("");

        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j <= 9 ; j++) {
                System.out.print(j + " x " + i + " = " + i * j + "\t  " + "| ");
            }
            System.out.println("\b\b");
        }
    }
}