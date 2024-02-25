package home_work_2.loops;

import java.util.Random;
import java.util.Scanner;

public class LoopsTask1_5 {
    public static void main(String[] args) {
//        System.out.println("Введите натуральное число");
        Scanner console = new Scanner(System.in);
//        long input = console.nextLong();
//        System.out.println(maxDigitOfNaturalNum(input)); // это ОК - потом раскомментировать

//        System.out.println("Вероятность генерации выпадения чётных случайных чисел:");
//        System.out.println(probabilityGenEvenRandomNumbers());//вызов метода для расчета вероятности выпадения четных случайных чисел

//        System.out.println(sumEvenOddNumbers());//вызов метода для подсчета четных и нечетных цифр введенного числа

//        System.out.println(fibonacciSequence());//вызов метода для вывода элементов ряда Фибоначчи

//        System.out.println(numbersInRangeInStepsOf5());//вызов метода для вывода ряда чисел в диапазоне с шагом

        System.out.println(numberReversal());





    }

    static String maxDigitOfNaturalNum(long number){
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

    static float probabilityGenEvenRandomNumbers(){
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

    static String sumEvenOddNumbers(){

        System.out.println("Введите натуральное число:");
        Scanner console = new Scanner(System.in);
        long input = console.nextLong();
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

    static String fibonacciSequence(){
        System.out.println("Введите натуральное число:");
        Scanner console = new Scanner(System.in);
        long elementsNumber = console.nextLong();
        String sequence = "1 1";
        int precedingEl = 1;
        int currentEl = 1;
        int countEl = 1;
        while (countEl <= elementsNumber){
            countEl += precedingEl;
            precedingEl = currentEl;
            currentEl = countEl;
            sequence = sequence + " " + Integer.toString(currentEl);
        }
        return sequence;
    }

    static String numbersInRangeInStepsOf5(){
        String result = "";
        Scanner console = new Scanner(System.in);
        System.out.println("Введите минимум диапазона:");
        int rangeMin = console.nextInt();
        System.out.println("Введите максимум диапазона:");
        int rangeMax = console.nextInt();
        System.out.println("Введите шаг:");
        int step = console.nextInt();

        while (rangeMin <= rangeMax) {
            result = result + Integer.toString(rangeMin) + " ";
            rangeMin += step;
        }
        return result;
    }

    static int numberReversal(){
        String result = "";
        Scanner console = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int inputNum = console.nextInt();
        int reversedNum = 0;

        while (inputNum > 0){
            reversedNum = reversedNum * 10 + inputNum % 10;
            inputNum /= 10;
        }
        return reversedNum;
    }
}
