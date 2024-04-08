package test.home_work_1;

import home_work_1.DivisibilityCheckMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class DivisibilityCheckTest {
    @DisplayName("Divisibility Check Test")
    @Test
    public void testDivisibilityCheck(){
        Assertions.assertEquals("Первое число без остатка делится на второе", DivisibilityCheckMain.divisibilityCheck(9, 3));
        Assertions.assertEquals("Первое число не делится без остатка на второе", DivisibilityCheckMain.divisibilityCheck(10, 3));
    }

    @DisplayName("ReturnRemainder Test")
    @Test
    public void testReturnRemainder(){
        Assertions.assertEquals(0, DivisibilityCheckMain.returnRemainder(9, 3));
        Assertions.assertEquals(1, DivisibilityCheckMain.returnRemainder(10, 3));
    }

    @DisplayName("ReturnQuotient Test")
    @Test
    public void testReturnQoutient(){
        Assertions.assertEquals(3, DivisibilityCheckMain.returnQuotient(9, 3));
        Assertions.assertEquals(3, DivisibilityCheckMain.returnQuotient(10, 3));
    }

}
