package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;
import java.util.Random;

public class ArraysTask2_4 {
    public static void main(String[] args) {
        int[] array = ArraysUtils.arrayRandom(50, 100);
        System.out.println(Arrays.toString(array));
        int[] newArray = randomizerNegPos(array);
        System.out.println(Arrays.toString(newArray));

        System.out.println(sumEvenPositiveElements(newArray));

        System.out.println("Полученное значение макс. элемента с чётным индексом");
        System.out.println(maxElWithEvenArrayIndex(array) + "\n");

        System.out.println("Elements less than the average value");
        System.out.println(elemLessThanAverage(array));

        System.out.println(twoMinElements(array));

        System.out.println(arrayCompressionByDeletionOfElements(array, 10, 50));//параметры a и b - диапазон данных, подлежащих удалению

        System.out.println("\nСумма цифр всех элементов массива = " + sumOfDigitsOfTheWholeArray(array));

    }

    public static int[] randomizerNegPos(int[] array){
        Random random = new Random();
        int[] arrayNew;
        arrayNew = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayNew[i] = array[i] * (random.nextBoolean() ? -1 : 1);// По условию задачи сказано, что массив должен
            // содержать как положительные, так и отрицательные числа.
            // Поэтому добавляем умножение на "(random.nextBoolean() ? -1 : 1)"
        }
        return arrayNew;
    }

    public static String sumEvenPositiveElements(int[] array) {

        String str = "";
        str += "Чётные положительные элементы:";

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] > 0) && (array[i] % 2 == 0)) {
                str += array[i] + " ";
                sum += array[i];
            }
        }
        str += "\n" + "Сумма чётных положительных элементов= " + sum + "\n";
        return str;

    }

    public static int maxElWithEvenArrayIndex(int[] array) {
        int max = 0;
        for (int i = max + 2; i < array.length; i += 2) {
            if (array[max] < array[i]) {
                max = i;
            }
        }
        return array[max];
    }

    public static String elemLessThanAverage(int[] array) {
        String str = "";
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        float average = sum / array.length;


        for (int i = 0; i < array.length; i++) {
            if (array[i] < average) {
                str += array[i] + " ";
            }
        }
        return str;
    }

    public static String twoMinElements(int[] array) {
        String str = "";

        int minInd1, minInd2;
        minInd1 = 0;
        minInd2 = 1;

        if (array[minInd1] >= array[minInd2]) {
            minInd1 = 1;
            minInd2 = 0;
        }

        for (int i = 2; i < array.length; i++) {
            if (array[i] <= array[minInd1]) {
                if (array[minInd1] <= array[minInd2]) {
                    minInd2 = i;
                } else if (array[minInd1] > array[minInd2]) {
                    minInd1 = i;
                }
            } else if (array[i] <= array[minInd2]) {
                minInd2 = i;
            }
        }
        str += "\nTwo found minimal elements are: \n" + array[minInd1] + " and " + array[minInd2] + "\n";
        return str;
    }

    public static String arrayCompressionByDeletionOfElements(int[] array, int a, int b) {
        String str = "";
        int[] arrayNew;
        arrayNew = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayNew[i] = array[i];
        }

        for (int i = 0; i < arrayNew.length; i++) {
            if ((arrayNew[i] >= a) && (arrayNew[i] <= b)) {

                for (int j = i; j < arrayNew.length - 1; j++) {//цикл по сдвигу всех оставшихся элементов,
                    // кроме самого правого на 1 позицию влево
                    arrayNew[j] = arrayNew[j + 1];
                }
                arrayNew[arrayNew.length - 1] = 0;//присваивание самому правому элементу значения 0
                i--;//возврат на предыдущую итерацию для проверки нового значения
            }
        }
        str += "Compressed array:";
        for (int i = 0; i < arrayNew.length; i++) {
            str += arrayNew[i] + " ";
        }
        return str;
    }

    public static int sumOfDigitsOfTheWholeArray(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
        }
        return sum;
    }
}