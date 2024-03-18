package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

        double result = calc.additionMethod(calc.additionMethod(4.1,calc.multiplicationMethod(15, 7)),calc.expOfNonIntPositiveNumber(calc.divisionMethod(28, 5),2));
        System.out.printf("Результат вычисления в калькуляторе CalculatorWithCounterAutoDecorator: %.2f%n", result);// 140,46
        /**
         * Используем приведение объекта ICalculator к типу CalculatorWithCounterAutoDecorator, чтобы получить возможность вызвать метод
         * getCountOperation, которого нет в интерфейсе ICalculator
         */
        System.out.printf("Значение счётчика использования калькулятора: %d%n", ((CalculatorWithCounterAutoDecorator) calc).getCountOperation());// 5

        System.out.println(((CalculatorWithCounterAutoDecorator) calc).getCalculator());
        System.out.println(calc instanceof CalculatorWithMemoryDecorator);









    }
}
