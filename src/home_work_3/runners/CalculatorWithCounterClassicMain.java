package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calc4 = new CalculatorWithCounterClassic();
        double op1 = calc4.divisionMethod(28, 5);
        calc4.incrementCountOperation();
        double op2 = calc4.expOfNonIntPositiveNumber(op1, 2);
        calc4.incrementCountOperation();
        double op3 = calc4.multiplicationMethod(15, 7);
        calc4.incrementCountOperation();
        double op4 = calc4.additionMethod(4.1, op3);
        calc4.incrementCountOperation();
        double op5 = calc4.additionMethod(op4, op2);
        calc4.incrementCountOperation();

        System.out.printf("%.2f", op5);// 140,46
    }
}