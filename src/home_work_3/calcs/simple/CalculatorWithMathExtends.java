package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    public CalculatorWithMathExtends() {

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
