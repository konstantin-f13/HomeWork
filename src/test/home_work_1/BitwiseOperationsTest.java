package test.home_work_1;


import home_work_1.BitwiseOperationsMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BitwiseOperationsTest {

    @DisplayName("Check of bitwise AND")
    @Test
    public void testBitwiseAnd(){
        Assertions.assertEquals(24, BitwiseOperationsMain.bitwiseAND(56, -100));
    }

    @DisplayName("Check of bitwise OR")
    @Test
    public void testBitwiseOr(){
        Assertions.assertEquals(-68, BitwiseOperationsMain.bitwiseOR(56, -100));
    }
}
