package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArraysIteration {
    public static void main(String[] args) {
        int[] array = ArraysUtils.arrayFromConsole();
        System.out.println("Output of array elements using 'do-while','while', 'for' and 'for-each'");
        System.out.println(outputToConsole(array));

        System.out.println("Output of every second element using 'do-while', ");
        System.out.println(outputEverySecondElement(array));

        System.out.println("Reversed output using 'do while', 'while', 'for' and 'for-each'");
        System.out.println(outputReversed(array));
    }
    public static String outputToConsole(int[] array){
        int i = 0;
        String str = "";

        do {
            str += array[i] + " ";
            i++;
        } while (i < array.length);
        str += "\n";

        i = 0;
        while (i < array.length){
            str += array[i] + " ";
            i++;
        }
        str += "\n";
        for (int j = 0; j < array.length; j++) {
            str += array[j] + " ";
        }
        str += "\n";
        for (int k: array) {
            str += k + " ";
        }
        return str;
    }

    public static String outputEverySecondElement(int[] array){
        int i = 1;
        String str2 = "";

        do {
            str2 += array[i] + " ";
            i += 2;
        } while (i < array.length);
        str2 += "\n";

        i = 1;
        while (i < array.length){
            str2 += array[i] + " ";
            i += 2;
        }
        str2 += "\n";

        for (int j = 1; j < array.length; j+=2) {
            str2 += array[j] + " ";
        }
        str2 += "\n";

        int j = 2;
        for (int k: array) {
            if (j % 2 != 0) {
                str2 += k + " ";
            }
            j++ ;
        }
        return str2;
    }

    public static String outputReversed(int[] array){
        String str3 = "";

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
            str3 += arrayRev[j] + " ";
            j++;
        } while (j < arrayRev.length);
        str3 += "\n";

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
            str3 += arrayRev3[c] + " ";
            c++;
        }
        str3 += "\n";

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
            str3 += arrayRev2[i] + " ";
        }
        str3 += "\n";

        int[] arrayRev4;
        arrayRev4 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayRev4[i] = array[i];
        }
        String reverse = "";
        for (int i : arrayRev4){
            reverse = Integer.toString(i) + " " + reverse;
        }
        str3 += reverse;
        return str3;
    }
}