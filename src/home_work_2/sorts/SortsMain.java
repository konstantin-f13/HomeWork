package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortUtils;

import java.util.Arrays;

public class SortsMain {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {1,1,1,1};
        int[] array3 = {9,1,5,99,9,9};
        int[] array4 = {};
        int[] array5 = {6,5,4,3,2,1};

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(SortUtils.sort(array1)));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(SortUtils.sort(array2)));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(SortUtils.sort(array3)));
        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.toString(SortUtils.sort(array4)));
        System.out.println(Arrays.toString(array5));
        System.out.println(Arrays.toString(SortUtils.sort(array5)));


        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(SortUtils.shake(array1)));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(SortUtils.shake(array2)));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(SortUtils.shake(array3)));
        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.toString(SortUtils.shake(array4)));
        System.out.println(Arrays.toString(array5));
        System.out.println(Arrays.toString(SortUtils.shake(array5)));

        int[] array6 = ArraysUtils.arrayRandom(50,100);
        System.out.println("Randomly generated array:");
        System.out.println(Arrays.toString(array6));
        Arrays.sort(array6);
        System.out.println("Sorted array:" + Arrays.toString(array6));

        int[] array7 = ArraysUtils.arrayFromConsole();
        System.out.println("Array received through console:");
        System.out.println(Arrays.toString(array7));
        Arrays.sort(array7);
        System.out.println("Sorted array:" + Arrays.toString(array7));
    }
}