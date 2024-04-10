package test.home_work_2;

import home_work_2.loops.LoopsTask1_5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SumEvenOddNumbersTest {

    @DisplayName("Number 34560")
    @Test
    public void test1(){
        Assertions.assertEquals("number of even numbers is 3, number of odd numbers is 2", LoopsTask1_5.sumEvenOddNumbers(34560));
    }

    @DisplayName("Number 953541")
    @Test
    public void test2(){
        Assertions.assertEquals("number of even numbers is 1, number of odd numbers is 5", LoopsTask1_5.sumEvenOddNumbers(953541));
    }
}
