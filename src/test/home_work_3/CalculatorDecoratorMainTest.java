package test.home_work_3;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorDecoratorMainTest {
    @DisplayName("Calculation check")
    @Test
    public void test1(){
        ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));
        double result = calc.additionMethod(calc.additionMethod(4.1,calc.multiplicationMethod(15, 7)),calc.expOfNonIntPositiveNumber(calc.divisionMethod(28, 5),2));
        Assertions.assertEquals(140.45999999999998, result);
    }

    @DisplayName("method getCountOperation check")
    @Test
    public void test2(){
        ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));
        calc.additionMethod(calc.additionMethod(4.1,calc.multiplicationMethod(15, 7)),calc.expOfNonIntPositiveNumber(calc.divisionMethod(28, 5),2));
        Assertions.assertEquals(5, ((CalculatorWithCounterAutoDecorator) calc).getCountOperation());
    }

    @DisplayName("check methods save, load() and cleanup of memory check")
    @Test
    public void test3(){
        ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));
        calc.additionMethod(calc.additionMethod(4.1,calc.multiplicationMethod(15, 7)),calc.expOfNonIntPositiveNumber(calc.divisionMethod(28, 5),2));
        ((CalculatorWithMemoryDecorator) ((CalculatorWithCounterAutoDecorator) calc).getCalculator()).save();
        Assertions.assertEquals(140.45999999999998, ((CalculatorWithMemoryDecorator) ((CalculatorWithCounterAutoDecorator) calc).getCalculator()).load());
        Assertions.assertEquals(0, ((CalculatorWithMemoryDecorator) ((CalculatorWithCounterAutoDecorator) calc).getCalculator()).load());
    }
}
