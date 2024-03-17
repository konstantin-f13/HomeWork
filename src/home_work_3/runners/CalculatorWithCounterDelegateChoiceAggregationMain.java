package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAggregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAggregationMain {
    public static void main(String[] args) {

        CalculatorWithOperator calcX = new CalculatorWithOperator();
        CalculatorWithCounterAutoChoiceAggregation calc8 = new CalculatorWithCounterAutoChoiceAggregation(calcX);
        double result = calc8.additionMethod(calc8.additionMethod(4.1,calc8.multiplicationMethod(15, 7)),calc8.expOfNonIntPositiveNumber(calc8.divisionMethod(28, 5),2));
        System.out.printf("Результат вычисления в калькуляторе CalculatorWithOperator: %.2f%n", result);// 140,46
        System.out.printf("Значение счётчика использования калькулятора: %d%n", calc8.getCountOperation());// 5

        CalculatorWithMathCopy calcY = new CalculatorWithMathCopy();
        calc8 = new CalculatorWithCounterAutoChoiceAggregation(calcY);
        result = calc8.additionMethod(calc8.additionMethod(4.1,calc8.multiplicationMethod(15, 7)),calc8.expOfNonIntPositiveNumber(calc8.divisionMethod(28, 5),2));
        System.out.printf("Результат вычисления в калькуляторе CalculatorWithMathCopy: %.2f%n", result);// 140,46
        System.out.printf("Значение счётчика использования калькулятора: %d%n", calc8.getCountOperation());// 5

        CalculatorWithMathExtends calcZ = new CalculatorWithMathExtends();
        calc8 = new CalculatorWithCounterAutoChoiceAggregation(calcZ);
        result = calc8.additionMethod(calc8.additionMethod(4.1,calc8.multiplicationMethod(15, 7)),calc8.expOfNonIntPositiveNumber(calc8.divisionMethod(28, 5),2));
        System.out.printf("Результат вычисления в калькуляторе CalculatorWithMathExtends: %.2f%n", result);// 140,46
        System.out.printf("Значение счётчика использования калькулятора: %d%n", calc8.getCountOperation());// 5
    }
}