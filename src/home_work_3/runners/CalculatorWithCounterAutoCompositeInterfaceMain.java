package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAggregationInterface;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {

        ICalculator calcI1 = new CalculatorWithOperator();
        CalculatorWithCounterAutoAggregationInterface calc1 = new CalculatorWithCounterAutoAggregationInterface(calcI1);
        double result = calc1.additionMethod(calc1.additionMethod(4.1,calc1.multiplicationMethod(15, 7)),calc1.expOfNonIntPositiveNumber(calc1.divisionMethod(28, 5),2));
        System.out.printf("Результат вычисления в калькуляторе CalculatorWithOperator: %.2f%n", result);// 140,46
        System.out.printf("Значение счётчика использования калькулятора: %d%n", calc1.getCountOperation());// 5

        ICalculator calcI2 = new CalculatorWithMathCopy();
        calc1 = new CalculatorWithCounterAutoAggregationInterface(calcI2);
        result = calc1.additionMethod(calc1.additionMethod(4.1,calc1.multiplicationMethod(15, 7)),calc1.expOfNonIntPositiveNumber(calc1.divisionMethod(28, 5),2));
        System.out.printf("Результат вычисления в калькуляторе CalculatorWithMathCopy: %.2f%n", result);// 140,46
        System.out.printf("Значение счётчика использования калькулятора: %d%n", calc1.getCountOperation());// 5

        ICalculator calcI3 = new CalculatorWithMathExtends();
        calc1 = new CalculatorWithCounterAutoAggregationInterface(calcI3);
        result = calc1.additionMethod(calc1.additionMethod(4.1,calc1.multiplicationMethod(15, 7)),calc1.expOfNonIntPositiveNumber(calc1.divisionMethod(28, 5),2));
        System.out.printf("Результат вычисления в калькуляторе CalculatorWithMathExtends: %.2f%n", result);// 140,46
        System.out.printf("Значение счётчика использования калькулятора: %d%n", calc1.getCountOperation());// 5
    }
}
