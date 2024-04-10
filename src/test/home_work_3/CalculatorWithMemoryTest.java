package test.home_work_3;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorWithMemoryTest {

    @DisplayName("loadTest")
    @Test
    public void loadTest(){
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        calc.divisionMethod(10, 5);
        calc.save();
        Assertions.assertEquals(2, calc.load());
    }
}
