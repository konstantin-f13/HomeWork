package test.home_work_1;

import home_work_1.StringToBinaryMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringToBinaryTest {

    @DisplayName("StringToBinary Tests")
    @Test
    public void stringToBinary1(){
        Assertions.assertEquals("00101010", StringToBinaryMain.toBinaryString((byte)42));
        Assertions.assertEquals("00001111", StringToBinaryMain.toBinaryString((byte)15));
        Assertions.assertEquals("11010110", StringToBinaryMain.toBinaryString((byte)-42));
        Assertions.assertEquals("11110001", StringToBinaryMain.toBinaryString((byte)-15));
    }
}
