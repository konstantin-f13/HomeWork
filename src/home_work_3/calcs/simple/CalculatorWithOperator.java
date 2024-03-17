package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
    /**
     *
     * @param firstNum - первое число
     * @param secondNum - второе число
     * @return возвращает результат деления первого числа на второе
     */
    public double divisionMethod(double firstNum, double secondNum){
        return firstNum / secondNum;
    }
    /**
     *
     * @param firstNum - первое число
     * @param secondNum - второе число
     * @return возвращает результат перемножения первого и второго числа
     */
    public double multiplicationMethod(double firstNum, double secondNum){
        return firstNum * secondNum;
    }
    /**
     *
     * @param firstNum - первое число
     * @param secondNum - второе число
     * @return возвращает результат вычитания из первого числа второго числа
     */
    public double subtractionMethod(double firstNum, double secondNum){
        return firstNum - secondNum;
    }
    /**
     *
     * @param firstNum - первое число
     * @param secondNum - второе число
     * @return возвращает результат сложения первого и второго числа
     */
    public double additionMethod(double firstNum, double secondNum){
        return firstNum + secondNum;
    }

    /**
     *
     * @param number - дробное положительное число
     * @param power - степень
     * @return возвращает результат возведения числа в степень
     */
    public double expOfNonIntPositiveNumber(double number, int power){
        double result = 0;

        if (power == 0) {
            result = 1;
        } else if (power > 0){
            result = number;
            for (int i = 2; i <= power ; i++) {
                result *= number;
            }
        }
        return result;
    }

    /**
     *
     * @param number - задаваемое число
     * @return возвращает значение по модулю
     */
    public double absoluteValue(double number){
        double result = 0;
        if (number >= 0){
            result = number;
        } else if (number < 0){
            result = -1 * number;
        }
        return result;
    }

    /**
     *
     * @param number число
     * @return возвращает квадратный корень числа
     */
    public double squareRoot(double number){
        return Math.sqrt(number);
    }
}
