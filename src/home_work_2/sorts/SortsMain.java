package home_work_2.sorts;

import home_work_2.arrays.ArraysUtils;

import java.util.Arrays;

public class SortsMain {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {1,1,1,1};
        int[] array3 = {9,1,5,99,9,9};
        int[] array4 = {};
        int[] array5 = {6,5,4,3,2,1};
        SortUtils.sort(array1);
        SortUtils.sort(array2);
        SortUtils.sort(array3);
        SortUtils.sort(array4);
        SortUtils.sort(array5);
        SortUtils.shake(array1);
        SortUtils.shake(array2);
        SortUtils.shake(array3);
        SortUtils.shake(array4);
        SortUtils.shake(array5);

        int[] array6 = ArraysUtils.arrayRandom(50,100);
        System.out.println("Randomly generated array:");
        System.out.println(Arrays.toString(array6));
        Arrays.sort(array6);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array6) + "\n");

        int[] array7 = ArraysUtils.arrayFromConsole();
        System.out.println("Array received through console:");
        System.out.println(Arrays.toString(array7));
        Arrays.sort(array7);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array7));
    }
}