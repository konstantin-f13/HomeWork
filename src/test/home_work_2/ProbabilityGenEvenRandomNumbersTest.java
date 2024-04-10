package test.home_work_2;

import home_work_2.loops.LoopsTask1_5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProbabilityGenEvenRandomNumbersTest {

    @DisplayName("Проверка получения значения вероятности более 45%")
    @Test
    public void test1(){
        Assertions.assertTrue(LoopsTask1_5.probabilityGenEvenRandomNumbers() > 45);

    }
}
