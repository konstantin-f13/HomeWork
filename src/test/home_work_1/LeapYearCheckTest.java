package test.home_work_1;

import home_work_1.LeapYearCheckMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LeapYearCheckTest {
    @DisplayName("year 2020")
    @Test
    public void leapYearCheck1() {
        Assertions.assertEquals("Год не столетие, год високосный.", LeapYearCheckMain.leapYearCheck(2020));
    }

    @DisplayName("year 1600")
    @Test
    public void leapYearCheck2() {
        Assertions.assertEquals("Год столетие и високосный.", LeapYearCheckMain.leapYearCheck(1600));
    }

    @DisplayName("year 1999")
    @Test
    public void leapYearCheck3() {
        Assertions.assertEquals("Год обычный.", LeapYearCheckMain.leapYearCheck(1999));
    }

    @DisplayName("year 1500")
    @Test
    public void leapYearCheck4() {
        Assertions.assertEquals("Год столетие, но не високосный.", LeapYearCheckMain.leapYearCheck(1500));
    }
}
