package test.home_work_2;

import home_work_2.arrays.ArraysIteration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArraysIterationTest {
    @DisplayName("outputToConsole")
    @Test
    public void outputToConsole1(){
        Assertions.assertEquals("1 2 3 \n" +
                "1 2 3 \n" +
                "1 2 3 \n" +
                "1 2 3 ", ArraysIteration.outputToConsole(new int[] {1,2,3}));
    }

    @DisplayName("outputEverySecondElement")
    @Test
    public void outputEverySecondElement1(){
        Assertions.assertEquals("2 \n" +
                "2 \n" +
                "2 \n" +
                "2 ", ArraysIteration.outputEverySecondElement(new int[] {1,2,3}));
    }

    @DisplayName("outputReversed")
    @Test
    public void outputReversed1(){
        Assertions.assertEquals("3 2 1 \n" +
                "3 2 1 \n" +
                "3 2 1 \n" +
                "3 2 1 ", ArraysIteration.outputReversed(new int[] {1,2,3}));
    }
}
