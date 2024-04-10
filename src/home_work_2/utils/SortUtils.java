package home_work_2.utils;

import java.util.Arrays;

public class SortUtils {

    public static int[] sort(int[] arr) {
        int[] arrayNew;
        arrayNew = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrayNew[i] = arr[i];
        }


        // Для всех элементов
        for (int i = 0; i < arrayNew.length - 1; i++) {

            for (int j = (arrayNew.length - 1); j > i; j--) // для всех элементов после i-ого
            {
                if (arrayNew[j - 1] > arrayNew[j]) // если текущий элемент меньше предыдущего
                {
                    int temp = arrayNew[j - 1]; // меняем их местами
                    arrayNew[j - 1] = arrayNew[j];
                    arrayNew[j] = temp;
                }
            }
        }
        return arrayNew;
    }

    public static int[] shake(int[] arr) {
        int[] arrayNew;
        arrayNew = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrayNew[i] = arr[i];
        }

        int left = 0, right = arrayNew.length - 1;
        int flag = 1;

        while ((left < right) && flag > 0) {

            flag = 0;
            for (int i = left; i < right; i++) {
                if (arrayNew[i] > arrayNew[i + 1]) {
                    int t = arrayNew[i];
                    arrayNew[i] = arrayNew[i + 1];
                    arrayNew[i + 1] = t;
                    flag = 1;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (arrayNew[i - 1] > arrayNew[i]) {
                    int t = arrayNew[i];
                    arrayNew[i] = arrayNew[i - 1];
                    arrayNew[i - 1] = t;
                    flag = 1;
                }
            }
            left++;
        }
        return arrayNew;
    }
}