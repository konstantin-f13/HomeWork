package test.home_work_2;

import home_work_2.loops.LoopsTask1_5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MaxDigitOfNaturalNumTest {

    @DisplayName("MaxDigitOfNaturalNumTest with number 764580")
    @Test
    public void test1(){
        Assertions.assertEquals("8", LoopsTask1_5.maxDigitOfNaturalNum(764580));
    }

    @DisplayName("MaxDigitOfNaturalNumTest with number 111")
    @Test
    public void test2(){
        Assertions.assertEquals("1", LoopsTask1_5.maxDigitOfNaturalNum(111));
    }
}
