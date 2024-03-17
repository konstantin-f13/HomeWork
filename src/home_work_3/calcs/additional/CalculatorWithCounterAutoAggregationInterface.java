package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAggregationInterface {
    private int countOperation = 0;
    public long getCountOperation(){
        return countOperation;
    }
    ICalculator calc;
    public CalculatorWithCounterAutoAggregationInterface(ICalculator calc) {
        this.calc = calc;
    }
    public double divisionMethod(double firstNum, double secondNum){
        countOperation++;
        return calc.divisionMethod(firstNum, secondNum);
    }
    public double multiplicationMethod(double firstNum, double secondNum){
        countOperation++;
        return calc.multiplicationMethod(firstNum, secondNum);
    }
    public double subtractionMethod(double firstNum, double secondNum){
        countOperation++;
        return calc.subtractionMethod(firstNum, secondNum);
    }
    public double additionMethod(double firstNum, double secondNum){
        countOperation++;
        return calc.additionMethod(firstNum, secondNum);
    }
    public double expOfNonIntPositiveNumber(double number, int power){
        countOperation++;
        return calc.expOfNonIntPositiveNumber(number, power);
    }
    public double absoluteValue(double number){
        countOperation++;
        return calc.absoluteValue(number);
    }
    public double squareRoot(double number){
        countOperation++;
        return calc.squareRoot(number);
    }
}