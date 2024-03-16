package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private int countOperation = 0;

    /**
     *
     * @return значение счётчика использования калькулятора
     */
    public long getCountOperation(){
        return countOperation;
    }

    @Override
    public double divisionMethod(double firstNum, double secondNum) {
        countOperation++;
        return super.divisionMethod(firstNum, secondNum);
    }

    @Override
    public double multiplicationMethod(double firstNum, double secondNum) {
        countOperation++;
        return super.multiplicationMethod(firstNum, secondNum);
    }

    @Override
    public double subtractionMethod(double firstNum, double secondNum) {
        countOperation++;
        return super.subtractionMethod(firstNum, secondNum);
    }

    @Override
    public double additionMethod(double firstNum, double secondNum) {
        countOperation++;
        return super.additionMethod(firstNum, secondNum);
    }

    @Override
    public double expOfNonIntPositiveNumber(double number, int power) {
        countOperation++;
        return super.expOfNonIntPositiveNumber(number, power);
    }

    @Override
    public double absoluteValue(double number) {
        countOperation++;
        return super.absoluteValue(number);
    }

    @Override
    public double squareRoot(double number) {
        countOperation++;
        return super.squareRoot(number);
    }
}
