package home_work_2.loops;

import java.util.Random;
import java.util.Scanner;

public class LoopsTask1_5 {
    public static void main(String[] args) {
        System.out.println("Введите натуральное число");
        Scanner console = new Scanner(System.in);
        long input = console.nextLong();
        System.out.println(maxDigitOfNaturalNum(input));
        System.out.println("Вероятность генерации выпадения чётных случайных чисел:");
        System.out.println(probabilityGenEvenRandomNumbers());//вызов метода для расчета вероятности выпадения четных случайных чисел

        System.out.println("Введите натуральное число:");
        console = new Scanner(System.in);
        input = console.nextLong();
        System.out.println(sumEvenOddNumbers(input));//вызов метода для подсчета четных и нечетных цифр введенного числа

        System.out.println("Введите натуральное число:");
        console = new Scanner(System.in);
        long elementsNumber = console.nextLong();
        System.out.println(fibonacciSequence(elementsNumber));//вызов метода для вывода элементов ряда Фибоначчи

        console = new Scanner(System.in);
        System.out.println("Введите минимум диапазона:");
        int rangeMin = console.nextInt();
        System.out.println("Введите максимум диапазона:");
        int rangeMax = console.nextInt();
        System.out.println("Введите шаг:");
        int step = console.nextInt();
        System.out.println(numbersInRangeInStepsOf5(rangeMin, rangeMax, step));//вызов метода для вывода ряда чисел в диапазоне с шагом

        console = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int inputNum = console.nextInt();
        System.out.println(numberReversal(inputNum));
    }

    public static String maxDigitOfNaturalNum(long number){
        long m = 0;
        long maxDigitTemp = 0;

        while (number > 0) {
            m = number % 10;
            number = number / 10;
            if (m > maxDigitTemp) {
                maxDigitTemp = m;
            }
        }
        return Long.toString(maxDigitTemp);
    }

    public static float probabilityGenEvenRandomNumbers(){
        Random random = new Random();
        int countEven = 0;
        for (int i = 1; i <= 1000; i++) {
            if (random.nextInt(99) % 2 == 0){
                countEven++;
            }
        }
        float probability = (countEven / 1000f) * 100f;
        return probability;
    }

    public static String sumEvenOddNumbers(long input){
        int even = 0;
        int odd = 0;

        while(input > 0) {
            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            input /= 10;
        }
        String result = "number of even numbers is " + Integer.toString(even) + ", number of odd numbers is " + Integer.toString(odd);
        return result;
    }

    public static String fibonacciSequence(long elementsNumber){
        if (elementsNumber <= 0) {
            return "Некорректный ввод. Число должно быть больше 0.";
        }

        String sequence = "1";
        long precedingEl = 0;
        long currentEl = 1;
        long countEl = 1;

        while (countEl < elementsNumber) {
            long nextEl = precedingEl + currentEl;
            sequence += " " + nextEl;

            precedingEl = currentEl;
            currentEl = nextEl;
            countEl++;
        }

        return sequence;

    }

    public static String numbersInRangeInStepsOf5(int rangeMin, int rangeMax, int step){
        String result = "";
        while (rangeMin <= rangeMax) {
            result = result + Integer.toString(rangeMin);
            rangeMin += step;
            if (rangeMin <= rangeMax){
                result += " ";
            }
        }
        return result;
    }

    public static int numberReversal(int inputNum){
        String result = "";
        int reversedNum = 0;

        while (inputNum > 0){
            reversedNum = reversedNum * 10 + inputNum % 10;
            inputNum /= 10;
        }
        return reversedNum;
    }
}
