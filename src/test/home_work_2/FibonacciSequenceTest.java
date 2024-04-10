package test.home_work_2;

import home_work_2.loops.LoopsTask1_5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FibonacciSequenceTest {
    @DisplayName("Number 6")
    @Test
    public void test1(){
        Assertions.assertEquals("1 1 2 3 5 8", LoopsTask1_5.fibonacciSequence(6));
    }

    @DisplayName("Number 4")
    @Test
    public void test2(){
        Assertions.assertEquals("1 1 2 3", LoopsTask1_5.fibonacciSequence(4));
    }

    @DisplayName("Number 1")
    @Test
    public void test3(){
        Assertions.assertEquals("1", LoopsTask1_5.fibonacciSequence(1));
    }

    @DisplayName("Number 2")
    @Test
    public void test4(){
        Assertions.assertEquals("1 1", LoopsTask1_5.fibonacciSequence(2));
    }

    @DisplayName("Number 3")
    @Test
    public void test5(){
        Assertions.assertEquals("1 1 2", LoopsTask1_5.fibonacciSequence(3));
    }

    @DisplayName("Number 0")
    @Test
    public void test6(){
        Assertions.assertEquals("Некорректный ввод. Число должно быть больше 0.", LoopsTask1_5.fibonacciSequence(0));
    }

}
