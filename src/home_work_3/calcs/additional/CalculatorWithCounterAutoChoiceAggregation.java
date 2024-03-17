package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAggregation {
    private int countOperation = 0;
    private CalculatorWithOperator calc1;
    private CalculatorWithMathCopy calc2;
    private CalculatorWithMathExtends calc3;
    public long getCountOperation(){
        return countOperation;
    }

    public CalculatorWithCounterAutoChoiceAggregation(CalculatorWithOperator calc) {
        this.calc1 = calc;
    }
    public CalculatorWithCounterAutoChoiceAggregation(CalculatorWithMathCopy calc) {
        this.calc2 = calc;
    }
    public CalculatorWithCounterAutoChoiceAggregation(CalculatorWithMathExtends calc) {
        this.calc3 = calc;
    }

    public double divisionMethod(double firstNum, double secondNum){
        double result = 0;
        countOperation++;
        if (calc1 != null && calc2 == null && calc3 == null){
            result = calc1.divisionMethod(firstNum, secondNum);
        } else if (calc1 == null && calc2 != null && calc3 == null){
            result = calc2.divisionMethod(firstNum, secondNum);
        } else if (calc1 == null && calc2 == null && calc3 != null) {
            result = calc3.divisionMethod(firstNum, secondNum);
        }
        return result;
    }

    public double multiplicationMethod(double firstNum, double secondNum){
        double result = 0;
        countOperation++;
        if (calc1 != null && calc2 == null && calc3 == null){
            result = calc1.multiplicationMethod(firstNum, secondNum);
        } else if (calc1 == null && calc2 != null && calc3 == null){
            result = calc2.multiplicationMethod(firstNum, secondNum);
        } else if (calc1 == null && calc2 == null && calc3 != null) {
            result = calc3.multiplicationMethod(firstNum, secondNum);
        }
        return result;
    }
    public double subtractionMethod(double firstNum, double secondNum){
        double result = 0;
        countOperation++;
        if (calc1 != null && calc2 == null && calc3 == null){
            result = calc1.subtractionMethod(firstNum, secondNum);
        } else if (calc1 == null && calc2 != null && calc3 == null){
            result = calc2.subtractionMethod(firstNum, secondNum);
        } else if (calc1 == null && calc2 == null && calc3 != null) {
            result = calc3.subtractionMethod(firstNum, secondNum);
        }
        return result;
    }

    public double additionMethod(double firstNum, double secondNum){
        double result = 0;
        countOperation++;
        if (calc1 != null && calc2 == null && calc3 == null){
            result = calc1.additionMethod(firstNum, secondNum);
        } else if (calc1 == null && calc2 != null && calc3 == null){
            result = calc2.additionMethod(firstNum, secondNum);
        } else if (calc1 == null && calc2 == null && calc3 != null) {
            result = calc3.additionMethod(firstNum, secondNum);
        }
        return result;
    }

    public double expOfNonIntPositiveNumber(double number, int power){
        double result = 0;
        countOperation++;
        if (calc1 != null && calc2 == null && calc3 == null){
            result = calc1.expOfNonIntPositiveNumber(number, power);
        } else if (calc1 == null && calc2 != null && calc3 == null){
            result = calc2.expOfNonIntPositiveNumber(number, power);
        } else if (calc1 == null && calc2 == null && calc3 != null) {
            result = calc3.expOfNonIntPositiveNumber(number, power);
        }
        return result;
    }

    public double absoluteValue(double number){
        double result = 0;
        countOperation++;
        if (calc1 != null && calc2 == null && calc3 == null){
            result = calc1.absoluteValue(number);
        } else if (calc1 == null && calc2 != null && calc3 == null){
            result = calc2.absoluteValue(number);
        } else if (calc1 == null && calc2 == null && calc3 != null) {
            result = calc3.absoluteValue(number);
        }
        return result;
    }

    public double squareRoot(double number){
        double result = 0;
        countOperation++;
        if (calc1 != null && calc2 == null && calc3 == null){
            result = calc1.squareRoot(number);
        } else if (calc1 == null && calc2 != null && calc3 == null){
            result = calc2.squareRoot(number);
        } else if (calc1 == null && calc2 == null && calc3 != null) {
            result = calc3.squareRoot(number);
        }
        return result;
    }
}
