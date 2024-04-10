package test.home_work_3;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorWithMathCopyTest {

    @DisplayName("divisionMethodTest")
    @Test
    public void divisionMethodTest(){
        Assertions.assertEquals(5.6, new CalculatorWithMathCopy().divisionMethod(28, 5));
    }

    @DisplayName("multiplicationMethod")
    @Test
    public void multiplicationMethodTest(){
        Assertions.assertEquals(105, new CalculatorWithMathCopy().multiplicationMethod(15, 7));
    }

    @DisplayName("subtractionMethod")
    @Test
    public void subtractionMethodTest(){
        Assertions.assertEquals(8, new CalculatorWithMathCopy().subtractionMethod(15, 7));
    }

    @DisplayName("additionMethod")
    @Test
    public void additionMethodTest(){
        Assertions.assertEquals(22, new CalculatorWithMathCopy().additionMethod(15, 7));
    }

    @DisplayName("expOfNonIntPositiveNumber")
    @Test
    public void expOfNonIntPositiveNumberTest(){
        Assertions.assertEquals(144, new CalculatorWithMathCopy().expOfNonIntPositiveNumber(12, 2));
    }

    @DisplayName("absoluteValue")
    @Test
    public void absoluteValueTest(){
        Assertions.assertEquals(666, new CalculatorWithMathCopy().absoluteValue(-666));
    }

    @DisplayName("squareRoot")
    @Test
    public void squareRootTest(){
        Assertions.assertEquals(12, new CalculatorWithMathCopy().squareRoot(144));
    }
}
