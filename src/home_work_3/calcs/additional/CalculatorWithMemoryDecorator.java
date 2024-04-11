package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {
    private ICalculator calc;
    double temp, savedValue;

    public CalculatorWithMemoryDecorator(ICalculator calc) {
        this.calc = calc;
    }

    public ICalculator getCalculator() {
        return calc;
    }
    public void save(){
        savedValue = temp;
    }

    public double load(){
        double tempValue = savedValue;
        savedValue = 0;
        return tempValue;
    }

    public double divisionMethod(double firstNum, double secondNum){
        temp = calc.divisionMethod(firstNum, secondNum);
        return temp;
    }
    public double multiplicationMethod(double firstNum, double secondNum){
        temp = calc.multiplicationMethod(firstNum, secondNum);
        return temp;
    }
    public double subtractionMethod(double firstNum, double secondNum){
        temp = calc.subtractionMethod(firstNum, secondNum);
        return temp;
    }
    public double additionMethod(double firstNum, double secondNum){
        temp = calc.additionMethod(firstNum, secondNum);
        return temp;
    }
    public double expOfNonIntPositiveNumber(double number, int power){
        temp = calc.expOfNonIntPositiveNumber(number, power);
        return temp;
    }
    public double absoluteValue(double number){
        temp = calc.absoluteValue(number);
        return temp;
    }
    public double squareRoot(double number){
        temp = calc.squareRoot(number);
        return temp;
    }

}
