package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArrayRandomMain {

    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayRandom(5, 100);
        System.out.println("Элементы заданного массива:");
        System.out.println(arrayPrint(container));

    }

    public static String arrayPrint(int[] container){
        String result = "";
        for (int i = 0; i < container.length; i++) {
            result += container[i] + " ";
        }
        return result;
    }

}


