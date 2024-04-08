package test.home_work_1;

import home_work_1.OddNumbersMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static home_work_1.OddNumbersMain.randomNumberGen;

public class OddNumbersTest {

    @DisplayName("Check of correct work of the method")
    @Test
    public void testOddNumbersIdentification(){
        int a = randomNumberGen();
        int b = randomNumberGen();
        Assertions.assertTrue(OddNumbersMain.oddNumIdentification(a, b) % 2 == 1);
    }
}
