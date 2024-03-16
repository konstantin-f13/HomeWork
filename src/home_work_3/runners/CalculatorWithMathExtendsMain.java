package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calc3 = new CalculatorWithMathExtends();
        double result = calc3.additionMethod(calc3.additionMethod(4.1,calc3.multiplicationMethod(15, 7)),calc3.expOfNonIntPositiveNumber(calc3.divisionMethod(28, 5),2));
        System.out.printf("%.2f", result);// 140,46
    }
}
