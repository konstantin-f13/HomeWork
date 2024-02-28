package home_work_2.sorts;

import java.util.Arrays;

public class SortUtils {

    public static void sort(int[] arr){

        int[] arrayNew;
        arrayNew = new int[arr.length];

        System.out.println("Какой массив был до сортировки");

        for (int i = 0; i < arr.length; i++) {
            arrayNew[i] = arr[i];
        }
        System.out.println(Arrays.toString(arrayNew));


        // Для всех элементов
        for (int i = 0; i < arrayNew.length - 1; i++){

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

        System.out.println("\n" + "Каким стал массив после сортировки");
        System.out.println(Arrays.toString(arrayNew));
        System.out.println("\n");
    }
    public static void shake(int[] arr){
        int[] arrayNew;
        arrayNew = new int[arr.length];

        System.out.println("Какой массив был до сортировки");
        for (int i = 0; i < arr.length; i++) {
            arrayNew[i] = arr[i];
        }
        System.out.println(Arrays.toString(arrayNew));

        int left = 0, right = arrayNew.length - 1;
        int flag = 1;

        while ((left < right) && flag > 0){

            flag = 0;
            for (int i = left; i < right; i++)
            {
                if (arrayNew[i] > arrayNew[i+1])
                {
                    int t = arrayNew[i];
                    arrayNew[i] = arrayNew[i+1];
                    arrayNew[i+1] = t;
                    flag = 1;
                }
            }
            right--;
            for (int i = right; i > left; i--)
            {
                if (arrayNew[i-1] > arrayNew[i])
                {
                    int t = arrayNew[i];
                    arrayNew[i] = arrayNew[i-1];
                    arrayNew[i-1] = t;
                    flag = 1;
                }
            }
            left++;
        }
        System.out.println("\n" + "Каким стал массив после сортировки: ");
        for (int i = 0; i < arrayNew.length; i++) {
        }
        System.out.println(Arrays.toString(arrayNew));
        System.out.println("\n");
    }
}