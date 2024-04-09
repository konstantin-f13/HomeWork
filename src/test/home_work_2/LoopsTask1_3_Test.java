package test.home_work_2;

import home_work_2.loops.LoopsTask1_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoopsTask1_3_Test {

    @DisplayName("Проверка 18 в степени 5")
    @Test
    public void loopsTask1_3_Test_1(){
        Assertions.assertEquals("Результат: 18.0 ^ 5 = 1889568.0", LoopsTask1_3.loopsTask1_3("18", "5"));
    }

    @DisplayName("Проверка 7.5 в степени 2")
    @Test
    public void loopsTask1_3_Test_2(){
        Assertions.assertEquals("Результат: 7.5 ^ 2 = 56.25", LoopsTask1_3.loopsTask1_3("7.5", "2"));
    }

    @DisplayName("Проверка на ввод Привет и Пока")
    @Test
    public void loopsTask1_3_Test_3(){
        Assertions.assertEquals("Вы ввели значение, не соответствующее запрошенным параметрам", LoopsTask1_3.loopsTask1_3("Привет", "Пока"));
    }
}
