package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calc5 = new CalculatorWithCounterAutoSuper();
        double result = calc5.additionMethod(calc5.additionMethod(4.1,calc5.multiplicationMethod(15, 7)),calc5.expOfNonIntPositiveNumber(calc5.divisionMethod(28, 5),2));
        System.out.printf("%.2f\n", result);// 140,46
        System.out.printf("Значение счётчика использования калькулятора %d", calc5.getCountOperation());// 5
    }
}
