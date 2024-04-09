package test.home_work_1;

import home_work_1.BytesToKilobytesMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BytesToKilobytesTest {
    @DisplayName("BytesToKilobytes")
    @Test
    public void methodBytesToKilobytes(){
        Assertions.assertEquals("Результат перевода числа в килобайты: 2", BytesToKilobytesMain.methodBytesToKilobytes(2048, "k"));;
    }

    @DisplayName("KilobytesToBytes")
    @Test
    public void methodKilobytesToBytes(){
        Assertions.assertEquals("Результат перевода числа в байты: 2048", BytesToKilobytesMain.methodBytesToKilobytes(2, "b"));;
    }

    @DisplayName("str neither k nor b")
    @Test
    public void methodDifferentStr(){
        Assertions.assertEquals("Введенные данные не соответствуют b или k.", BytesToKilobytesMain.methodBytesToKilobytes(1024, "r"));;
    }

}
