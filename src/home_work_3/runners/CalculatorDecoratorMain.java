package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator calc1 = new CalculatorWithMathExtends();
        ICalculator calc2 = new CalculatorWithMemoryDecorator(calc1);
        ICalculator calc3 = new CalculatorWithCounterAutoDecorator(calc2);

        double result = calc3.additionMethod(calc3.additionMethod(4.1,calc3.multiplicationMethod(15, 7)),calc3.expOfNonIntPositiveNumber(calc3.divisionMethod(28, 5),2));
        System.out.printf("Результат вычисления в калькуляторе CalculatorWithCounterAutoDecorator: %.2f%n", result);// 140,46
        /**
         * Используем приведение объекта ICalculator к типу CalculatorWithCounterAutoDecorator, чтобы получить возможность вызвать метод
         * getCountOperation, которого нет в интерфейсе ICalculator
         */
        System.out.printf("Значение счётчика использования калькулятора: %d%n", ((CalculatorWithCounterAutoDecorator) calc3).getCountOperation());// 5

        System.out.println(((CalculatorWithCounterAutoDecorator) calc3).getCalculator());
        System.out.println(((CalculatorWithMemoryDecorator) calc2).getCalculator());

//        ICalculator newCalc = ((CalculatorWithMemoryDecorator) calc3). getCalculator();
//        ((CalculatorWithMemoryDecorator)calc3).save();
//        System.out.println(((CalculatorWithMemoryDecorator)calc3).load());






    }
}