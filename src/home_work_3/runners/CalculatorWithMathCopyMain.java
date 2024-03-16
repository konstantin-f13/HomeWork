package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calc2 = new CalculatorWithMathCopy();
        double result = calc2.additionMethod(calc2.additionMethod(4.1,calc2.multiplicationMethod(15, 7)),calc2.expOfNonIntPositiveNumber(calc2.divisionMethod(28, 5),2));
        System.out.printf("%.2f", result);// 140,46
    }
}
