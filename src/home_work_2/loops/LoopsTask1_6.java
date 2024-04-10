package home_work_2.loops;

public class LoopsTask1_6 {
    public static void main(String[] args) {
        printRow(2,5);
        printLine();
        printRow(6,9);
    }

    public static void printRow(int from, int to){
        for (int i = 1; i <= 10; i++) {
            for (int j = from; j <= to ; j++) {
                System.out.print(j + " x " + i + " = " + i * j + "\t  " + "| ");
            }
            System.out.println("\b\b");
        }

    }

    public static void printLine(){
        int count = 0;

        while (count <= 58) {
            System.out.print("_");
            count++;
        }
        System.out.println("");
    }
}