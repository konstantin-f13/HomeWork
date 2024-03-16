package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private int countOperation;

    /**
     * метод увеличения счётчика использования калькулятора класса CalculatorWithCounterClassic
     */
    public void incrementCountOperation() {
        countOperation++;
    }

    /**
     *
     * @return текущее значение счётчика использования калькулятора
     */
    public long getCountOperation(){
        return countOperation;
    }
}