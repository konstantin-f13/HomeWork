package test.home_work_1;

import home_work_1.LetterOrSymbolMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LetterOrSymbolTest {
    @DisplayName("Letter test")
    @Test
    public void letterCheck(){
        Assertions.assertEquals("Это буква C", LetterOrSymbolMain.methodLetterOrSymbol(67));;
    }

    @DisplayName("Symbol test")
    @Test
    public void symbolCheck(){
        Assertions.assertEquals("Это не буква, а символ _", LetterOrSymbolMain.methodLetterOrSymbol(95));;
    }
}
