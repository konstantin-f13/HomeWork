package test.home_work_1;

import home_work_1.MathLibraryPracticeMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MathLibraryPracticeTest {

    @DisplayName("Check of absolute value method")
    @Test
    public void testAbsValue(){
        double a = -505.3324324;
        double b = MathLibraryPracticeMain.absValue(a);
        Assertions.assertEquals(505.3324324, b);
    }

    @DisplayName("Check of sine calculation")
    @Test
    public void testSineCalculation(){
        double a = -505.3324324;
        double b = Math.abs(a);
       Assertions.assertEquals(-0.5688140558390234, MathLibraryPracticeMain.sinCalculation(a));
       Assertions.assertEquals(0.5688140558390234, MathLibraryPracticeMain.sinCalculation(b));
    }

    @DisplayName("Check of ulp calculation")
    @Test
    public void testUlpCalculation(){
        double a = -505.3;
        double b = Math.abs(a);
        Assertions.assertEquals(5.6843418860808015E-14, MathLibraryPracticeMain.ulpCalculation(b));
    }

    @DisplayName("Check of power method")
    @Test
    public void testPow(){
        double c = 12;
        double d = 2;
        Assertions.assertEquals(144, MathLibraryPracticeMain.powMethod(c, d));
    }

    @DisplayName("Math.min and math.max check")
    @Test
    public void testMinMax(){
        double c = 12;
        double d = 2;
        Assertions.assertEquals(2, MathLibraryPracticeMain.minMethod(c, d));
        Assertions.assertEquals(12, MathLibraryPracticeMain.maxMethod(c, d));
    }

    @DisplayName("Math.ceil check")
    @Test
    public void testMathCeil(){
        double e = 5.6;
        Assertions.assertEquals(6.0, MathLibraryPracticeMain.ceilMethod(e));
    }

    @DisplayName("Math.floor check")
    @Test
    public void testMathFloor(){
        double e = 5.6;
        Assertions.assertEquals(5.0, MathLibraryPracticeMain.floorMethod(e));
    }

    @DisplayName("Math.round check")
    @Test
    public void testMathRound(){
        double e = 5.6;
        Assertions.assertEquals(6, MathLibraryPracticeMain.roundMethod(e));
    }

    @DisplayName("Math.nextAfter check")
    @Test
    public void testMathNextAfter(){
        double e = 5.6;
        Assertions.assertEquals(5.599999999999999, MathLibraryPracticeMain.nextAfterMethod(e, 3));
    }

    @DisplayName("Math.nextUp check")
    @Test
    public void testMathNextUp(){
        double e = 5.6;
        Assertions.assertEquals(5.6000000000000005, MathLibraryPracticeMain.nextUpMethod(e));
    }

    @DisplayName("Math.nextDown check")
    @Test
    public void testMathNextDown(){
        double e = 5.6;
        Assertions.assertEquals(5.599999999999999, MathLibraryPracticeMain.nextDownMethod(e));
    }

    @DisplayName("Math.rint check")
    @Test
    public void testMathRint(){
        double e = 5.6;
        Assertions.assertEquals(6, MathLibraryPracticeMain.rintMethod(e));
    }

    @DisplayName("Math.random check")
    @Test
    public void testMathRandom(){
        double a = MathLibraryPracticeMain.randomMethod();
        Assertions.assertTrue(a > 0 && a < 1);
        Assertions.assertNotNull(a);
        Assertions.assertNotSame(MathLibraryPracticeMain.randomMethod(), a);
    }

    @DisplayName("Math.sqrt int check")
    @Test
    public void testMathSqrt(){
        Assertions.assertEquals(3, MathLibraryPracticeMain.sqrtMethod(9));
        Assertions.assertEquals(12d, MathLibraryPracticeMain.sqrtMethod(144.00));
    }
}
