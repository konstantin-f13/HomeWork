package test.home_work_2;

import home_work_2.loops.LoopsTask1_5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumbersInRangeInStepsOf5Test {

    @DisplayName("от 10 до 35 с шагом 5")
    @Test
    public void test1(){
        Assertions.assertEquals("10 15 20 25 30 35", LoopsTask1_5.numbersInRangeInStepsOf5(10, 35, 5));
    }

    @DisplayName("от 10 до 35 с шагом 7")
    @Test
    public void test2(){
        Assertions.assertEquals("10 17 24 31", LoopsTask1_5.numbersInRangeInStepsOf5(10, 35, 7));
    }

    @DisplayName("от 35 до 10 с шагом 7")
    @Test
    public void test3(){
        Assertions.assertEquals("", LoopsTask1_5.numbersInRangeInStepsOf5(35, 10, 7));
    }
}
