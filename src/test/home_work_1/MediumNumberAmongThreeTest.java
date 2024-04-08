package test.home_work_1;

import home_work_1.MediumNumberAmongThreeMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MediumNumberAmongThreeTest {
    @DisplayName("Test for numbers in different order")
    @Test
    public void testMediumAmongThree(){
        Assertions.assertEquals(15, MediumNumberAmongThreeMain.mediumNumberAmongThree((byte) 11, (byte) 15, (byte) 30));
        Assertions.assertEquals(15, MediumNumberAmongThreeMain.mediumNumberAmongThree((byte) 30, (byte) 15, (byte) 11));
        Assertions.assertEquals(15, MediumNumberAmongThreeMain.mediumNumberAmongThree((byte) 11, (byte) 30, (byte) 15));
        Assertions.assertEquals(15, MediumNumberAmongThreeMain.mediumNumberAmongThree((byte) 15, (byte) 11, (byte) 30));
        Assertions.assertEquals(15, MediumNumberAmongThreeMain.mediumNumberAmongThree((byte) 15, (byte) 30, (byte) 11));
    }
}
