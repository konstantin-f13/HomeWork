package test.home_work_2;

import home_work_2.loops.LoopsTask1_1;
import home_work_2.loops.LoopsTask1_1_Recursion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoopsTask1_1_Recursion_Test {

    @DisplayName("test with number 5")
    @Test
    public void loopsTask1_1_test1(){
        Assertions.assertEquals(120, LoopsTask1_1_Recursion.factorial(5));

    }

    @DisplayName("test with number 7")
    @Test
    public void loopsTask1_1_test2(){
        Assertions.assertEquals(5040, LoopsTask1_1_Recursion.factorial(7));

    }

    @DisplayName("test with number 2")
    @Test
    public void loopsTask1_1_test3(){
        Assertions.assertEquals(2, LoopsTask1_1_Recursion.factorial(2));
    }
}
