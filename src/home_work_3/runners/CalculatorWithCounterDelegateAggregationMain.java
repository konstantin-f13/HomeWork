package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAggregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAggregationMain {
    public static void main(String[] args) {

        CalculatorWithMathCopy calcX = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAggregation calc7 = new CalculatorWithCounterAutoAggregation(calcX);
        double result = calc7.additionMethod(calc7.additionMethod(4.1,calc7.multiplicationMethod(15, 7)),calc7.expOfNonIntPositiveNumber(calc7.divisionMethod(28, 5),2));
        System.out.printf("Результат вычисления: %.2f%n", result);// 140,46
        System.out.printf("Значение счётчика использования калькулятора: %d", calc7.getCountOperation());// 5
    }
}