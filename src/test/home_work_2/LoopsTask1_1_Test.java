package test.home_work_2;

import home_work_2.loops.LoopsTask1_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoopsTask1_1_Test {

    @DisplayName("test with number 5")
    @Test
    public void loopsTask1_1_test1(){
        Assertions.assertEquals("1 * 2 * 3 * 4 * 5 = 120", LoopsTask1_1.loopsTask1_1(5));

    }

    @DisplayName("test with number 7")
    @Test
    public void loopsTask1_1_test2(){
        Assertions.assertEquals("1 * 2 * 3 * 4 * 5 * 6 * 7 = 5040", LoopsTask1_1.loopsTask1_1(7));

    }

    @DisplayName("test with number 2")
    @Test
    public void loopsTask1_1_test3(){
        Assertions.assertEquals("1 * 2 = 2", LoopsTask1_1.loopsTask1_1(2));
    }
}
