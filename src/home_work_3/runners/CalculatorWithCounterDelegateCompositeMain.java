package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calc6 = new CalculatorWithCounterAutoComposite();
        double result = calc6.additionMethod(calc6.additionMethod(4.1,calc6.multiplicationMethod(15, 7)),calc6.expOfNonIntPositiveNumber(calc6.divisionMethod(28, 5),2));
        System.out.printf("%.2f%n", result);// 140,46
        System.out.printf("Значение счётчика использования калькулятора: %d", calc6.getCountOperation());// 5
    }

}
