package test.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MathLibraryPracticeTest {

    @DisplayName("Check of absolute value method")
    @Test
    public void testAbsValue(){
        double a = -505.3324324;
        double b = Math.abs(a);
        Assertions.assertEquals(505.3324324, b);
    }

    @DisplayName("Check of sine calculation")
    @Test
    public void testSineCalculation(){
        double a = -505.3324324;
       Assertions.assertEquals(-0.5688140558390234, Math.sin(Math.toRadians(a)));
       Assertions.assertEquals(0.5688140558390234, Math.sin(Math.toRadians(Math.abs(a))));
    }

    @DisplayName("Check of ulp calculation")
    @Test
    public void testUlpCalculcation(){
        double a = -505.3;
        double b = Math.abs(a);
        Assertions.assertEquals(5.6843418860808015E-14, Math.ulp(b));
    }

    @DisplayName("Check of power method")
    @Test
    public void testPow(){
        double c = 12;
        double d = 2;
        Assertions.assertEquals(144, Math.pow(c, d));
    }

    @DisplayName("Math.min and math.max check")
    @Test
    public void testMinMax(){
        double c = 12;
        double d = 2;
        Assertions.assertEquals(2, Math.min(c, d));
        Assertions.assertEquals(12, Math.max(c, d));
    }

    @DisplayName("Math.ceil check")
    @Test
    public void testMathCeil(){
        double e = 5.6;
        Assertions.assertEquals(6.0, Math.ceil(e));
    }

    @DisplayName("Math.floor check")
    @Test
    public void testMathFloor(){
        double e = 5.6;
        Assertions.assertEquals(5.0, Math.floor(e));
    }

    @DisplayName("Math.round check")
    @Test
    public void testMathRound(){
        double e = 5.6;
        Assertions.assertEquals(6, Math.round(e));
    }

    @DisplayName("Math.nextAfter check")
    @Test
    public void testMathNextAfter(){
        double e = 5.6;
        Assertions.assertEquals(5.599999999999999, Math.nextAfter(e, 3));
    }

    @DisplayName("Math.nextUp check")
    @Test
    public void testMathNextUp(){
        double e = 5.6;
        Assertions.assertEquals(5.6000000000000005, Math.nextUp(e));
    }

    @DisplayName("Math.nextDown check")
    @Test
    public void testMathNextDown(){
        double e = 5.6;
        Assertions.assertEquals(5.599999999999999, Math.nextDown(e));
    }

    @DisplayName("Math.rint check")
    @Test
    public void testMathRint(){
        double e = 5.6;
        Assertions.assertEquals(6, Math.rint(e));
    }

    @DisplayName("Math.random check")
    @Test
    public void testMathRandom(){
        double a = Math.random();
        Assertions.assertTrue(a > 0 && a < 1);
        Assertions.assertNotNull(a);
        Assertions.assertNotSame(Math.random(), a);
    }

    @DisplayName("Math.sqrt int check")
    @Test
    public void testMathSqrt(){
        Assertions.assertEquals(3, Math.sqrt(9));
        Assertions.assertEquals(12d, Math.sqrt(144.00));
    }
}
