package home_work_4.utils;

import java.util.Comparator;

public class ArraySorting<T> {

    public static <T> void sort(Comparator<T> comparator, T[] arr){
        for (int i = 0; i < arr.length; i++){

            for (int j = (arr.length - 1); j > i; j--)
            {
                if (comparator.compare(arr[j - 1], arr[j]) > 0)
                {
                    T temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}