package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc1 = new CalculatorWithOperator();
        double result = calc1.additionMethod(calc1.additionMethod(4.1,calc1.multiplicationMethod(15, 7)),calc1.expOfNonIntPositiveNumber(calc1.divisionMethod(28, 5),2));
        System.out.printf("%.2f", result);// 140,46
    }
}
