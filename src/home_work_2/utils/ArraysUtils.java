package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    public static int[] arrayFromConsole(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int arraySize = console.nextInt();
        System.out.println("Введите каждый элемент массива:");

        int[] array;
        array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Введите %d-й элемент массива: %n", i);
            array[i] = console.nextInt();
        }
        return array;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion){
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxValueExclusion);
        }
        return array;
    }
}
