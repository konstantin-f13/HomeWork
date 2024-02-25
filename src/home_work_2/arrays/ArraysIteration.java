package home_work_2.arrays;

public class ArraysIteration {
    public static void main(String[] args) {
        int[] array = ArraysUtils.arrayFromConsole();
        outputToConsole(array);
        outputEverySecondElement(array);
        outputReversed(array);
    }
    static void outputToConsole(int[] array){
        int i = 0;
        System.out.println("Output of array elements using 'do-while'");

        do {
            System.out.print(array[i] + " ");
            i++;
        } while (i < array.length);

        System.out.println("\n" + "Output of array elements using 'while'");
        i = 0;
        while (i < array.length){
            System.out.print(array[i] + " ");
            i++;
        }

        System.out.println("\n" + "Output of array elements using 'for'");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }

        System.out.println("\n" + "Output of array elements using 'for-each'");
        for (int k: array) {
            System.out.print(k + " ");
        }
        System.out.println("\n");
    }

    static void outputEverySecondElement(int[] array){
        int i = 1;
        System.out.println("Output of every second element using 'do-while'");
        do {
            System.out.print(array[i] + " ");
            i += 2;
        } while (i < array.length);

        System.out.println("\n" + "Output of every second element using 'while'");
        i = 1;
        while (i < array.length){
            System.out.print(array[i] + " ");
            i += 2;
        }

        System.out.println("\n" + "Output of every second element using 'for'");
        for (int j = 1; j < array.length; j+=2) {
            System.out.print(array[j] + " ");
        }

        System.out.println("\n" + "Output of every second element using 'for-each'");
        int j = 2;
        for (int k: array) {
            if (j % 2 != 0) {
                System.out.print(k + " ");
            }
            j++ ;
        }

        System.out.println("\n");
    }
    static void outputReversed(int[] array){
        System.out.println("Reversed output using 'do while'");
        int[] arrayRev;
        arrayRev = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayRev[i] = array[i];
        }
        int j = 0;
        do {
            int temp = arrayRev[j];
            arrayRev[j] = arrayRev[arrayRev.length - j - 1];
            arrayRev[arrayRev.length - j - 1] = temp;
            j++;
        } while (j < arrayRev.length/2);

        j = 0;
        do {
            System.out.print(arrayRev[j] + " ");
            j++;
        } while (j < arrayRev.length);

        System.out.println("\n" + "Reversed output using 'while'");
        int[] arrayRev3;
        arrayRev3 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayRev3[i] = array[i];
        }

        int c = 0;
        while (c < arrayRev3.length/2){
            int temp = arrayRev3[c];
            arrayRev3[c] = arrayRev3[arrayRev3.length - c -1];
            arrayRev3[arrayRev3.length - c - 1] = temp;
            c++;
        }
        c = 0;
        while (c < arrayRev3.length){
            System.out.print(arrayRev3[c] + " ");
            c++;
        }

        System.out.println("\n" + "Reversed output using 'for'");
        int[] arrayRev2;
        arrayRev2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayRev2[i] = array[i];
        }

        for (int i = 0; i < arrayRev2.length/2; i++) {
            int temp = arrayRev2[i];
            arrayRev2[i] = arrayRev2[arrayRev2.length - i - 1];
            arrayRev2[arrayRev2.length - i - 1] = temp;
        }
        for (int i = 0; i < arrayRev2.length; i++) {
            System.out.print(arrayRev2[i] + " ");
        }

        System.out.println("\n" + "Reversed output using 'for-each'");
        int[] arrayRev4;
        arrayRev4 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayRev4[i] = array[i];
        }
        String reverse = "";
        for (int i : arrayRev4){
            reverse = Integer.toString(i) + " " + reverse;
        }
        System.out.println(reverse);
    }
}