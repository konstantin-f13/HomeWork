package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArrayFromConsoleMain {
    public static void main(String[] args) {

        int[] container = ArraysUtils.arrayFromConsole();
        System.out.println("Элементы заданного массива");
        for (int i = 0; i < container.length; i++) {
            System.out.print(container[i] + " ");
        }
    }
}
