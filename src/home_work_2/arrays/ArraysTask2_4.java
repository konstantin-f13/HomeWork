package home_work_2.arrays;

import java.util.Random;

public class ArraysTask2_4 {
    public static void main(String[] args) {
        int[] array = ArraysUtils.arrayRandom(50,100);

//        sumEvenPositiveElements(array);
        System.out.println(maxElWithEvenArrayIndex(array));


    }

    static void sumEvenPositiveElements(int[] array){
        Random random = new Random();
        int[] arrayNew;
        arrayNew = new int[array.length];
        System.out.println("Сгенерированные элементы:");
        for (int i = 0; i < array.length; i++) {
            arrayNew[i] = array[i] * (random.nextBoolean() ? -1 : 1);// По условию задачи сказано, что массив должен
            // содержать как положительные, так и отрицательные числа.
            // Поэтому добавляем умножение на "(random.nextBoolean() ? -1 : 1)"
            System.out.print(arrayNew[i] + " ");
        }
        System.out.println("\n" + "Чётные положительные элементы:");

        int sum = 0;
        for (int i = 0; i < arrayNew.length; i++) {
            if ((arrayNew[i] > 0) && (arrayNew[i] % 2 == 0)){
                System.out.print(arrayNew[i] + " ");
                sum += arrayNew[i];
            }
        }
        System.out.println("\n" + "Сумма чётных положительных элементов= " + sum);
    }

    static int maxElWithEvenArrayIndex(int[] array){
        System.out.println("Сгенерированные элементы:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int max = 0;
        for (int i = max + 2; i < array.length; i += 2) {
            if (array[max] < array[i]){
                max = i;
            }
        }
        System.out.println("\n"+ "Полученное значение макс. элемента с чётным индексом");
        return array[max];
    }
}

