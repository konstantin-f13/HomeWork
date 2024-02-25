package home_work_2.arrays;

public class ArrayFromConsoleMain {
    public static void main(String[] args) {

        int[] container = ArraysUtils.arrayFromConsole();
        System.out.println("Элементы заданного массива");
        for (int i = 0; i < container.length; i++) {
            System.out.print(container[i] + " ");
        }
    }
}
