package test.home_work_2;

import home_work_2.loops.LoopsTask1_5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumberReversalTest {

    @DisplayName("Number 3486")
    @Test
    public void test1(){
        Assertions.assertEquals(6843, LoopsTask1_5.numberReversal(3486));
    }

    @DisplayName("Number 0")
    @Test
    public void test2(){
        Assertions.assertEquals(0, LoopsTask1_5.numberReversal(0));
    }


}
