package test.home_work_2;

import home_work_2.loops.LoopsTask1_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoopsTask1_2_Test {

    @DisplayName("Test with 181232375 input")
    @Test
    public void loopsTask1_2_Test1(){
        Assertions.assertEquals("Заданное через аргумент к программе целое число = 181232375\n" +
                "Произведение всех цифр заданного числа: \n" +
                "1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10080", LoopsTask1_2.loopsTask1_2("181232375"));
    }

    @DisplayName("Test with 99.2 input")
    @Test
    public void loopsTask1_2_Test2(){
        Assertions.assertEquals("Введено нецелое число.", LoopsTask1_2.loopsTask1_2("99.2"));
    }

    @DisplayName("Test with Привет input")
    @Test
    public void loopsTask1_2_Test3(){
        Assertions.assertEquals("Введено не число, а вообще что-то другое", LoopsTask1_2.loopsTask1_2("Привет"));
    }
}
