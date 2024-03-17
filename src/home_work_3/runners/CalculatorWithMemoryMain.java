package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {

        ICalculator calcI1 = new CalculatorWithOperator();
        CalculatorWithMemory calc1 = new CalculatorWithMemory(calcI1);
        calc1.divisionMethod(28, 5);
        calc1.save();
        calc1.expOfNonIntPositiveNumber(calc1.load(), 2);
        calc1.save();
        calc1.additionMethod(4.1, calc1.load());
        calc1.save();
        calc1.additionMethod(calc1.load(), calc1.multiplicationMethod(15, 7));
        calc1.save();
        System.out.printf("%.2f%n", calc1.load()); // 140.46
    }
}