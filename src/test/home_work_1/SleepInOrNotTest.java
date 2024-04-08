package test.home_work_1;

import home_work_1.SleepInOrNotMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SleepInOrNotTest {

    @DisplayName("Check of method's logic")
    @Test
    public void testSleepInOrNot(){
        Assertions.assertTrue(SleepInOrNotMain.sleepIn(false, false));
        Assertions.assertTrue(SleepInOrNotMain.sleepIn(false, true));
        Assertions.assertTrue(SleepInOrNotMain.sleepIn(true, true));
        Assertions.assertFalse(SleepInOrNotMain.sleepIn(true, false));
    }
}