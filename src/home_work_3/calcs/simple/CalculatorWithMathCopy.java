package home_work_3.calcs.simple;

public class CalculatorWithMathCopy {

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
     * @param number - число
     * @param power - степень
     * @return возвращает результат возведения в степень
     */
    public double expOfNonIntPositiveNumber(double number, int power){
        return Math.pow(number, power);
    }

    /**
     *
     * @param number - задаваемое число
     * @return модуль числа
     */
    public double absoluteValue(double number){
        return Math.abs(number);
    }

    /**
     *
     * @param number - задаваемое число
     * @return квадратный корень из числа
     */
    public double squareRoot(double number){
        return Math.sqrt(number);
    }
}