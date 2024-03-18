package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithCounterClassic;
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
        /**
         * оператор instanceof позволяет проверить, принадлежит ли объект какому-либо классу либо интерфейсу.
         * А если объект принадлежит классу, то он может вызывать методу этого класса через точку.
         * Как видим ниже, getCalculator позволяет вернуть объект калькулятор, который передавали в конструктор
         * класса CalculatorWithCounterAutoDecorator, в котором отсутствуют методы save() и load(), но присутствуют
         * другие, например, getCountOperation. В общем, используем это для того, чтобы расширить функционал, используя
         * методы, хранящихся в других классах.
         */
        if (((CalculatorWithCounterAutoDecorator) calc).getCalculator() instanceof CalculatorWithMemoryDecorator) {
            ((CalculatorWithMemoryDecorator) ((CalculatorWithCounterAutoDecorator) calc).getCalculator()).save();
            System.out.printf("Сохраненное в памяти значение: %.2f%n", ((CalculatorWithMemoryDecorator) ((CalculatorWithCounterAutoDecorator) calc).getCalculator()).load());
            System.out.printf("Проверка очистки памяти метода load(): %.2f%n", ((CalculatorWithMemoryDecorator) ((CalculatorWithCounterAutoDecorator) calc).getCalculator()).load());
        }

        calc = new CalculatorWithCounterClassic();
        /**
         * Проверяем, принадлежит ли теперь объект calc класса ICalculator классу CalculatorWithCounterClassic,
         * который наследует класс CalculatorWithMathExtends, который реализует интерфейс ICalculator.
         * Если бы CalculatorWithMathExtends не имплементировал бы интерфейс ICalculator, то новая инициализация
         * объекта calc типу CalculatorWithCounterClassic была бы невозможной.
         */
        if (calc instanceof CalculatorWithCounterClassic){
            System.out.println("Объект calc был изменен и теперь принаджелит классу CalculatorWithCounterClassic");
        }
    }
}