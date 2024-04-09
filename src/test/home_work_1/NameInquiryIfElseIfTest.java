package test.home_work_1;

import home_work_1.NameInquiryIfElse;
import home_work_1.NameInquiryIfElseIf;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NameInquiryIfElseIfTest {

    @DisplayName("nameInquiryTest Вася")
    @Test
    public void nameInquiryTest1(){
        Assertions.assertEquals("Привет!" + "\n" + "Я тебя так долго ждал", NameInquiryIfElseIf.nameInquiryIfElseIf("Вася"));
    }

    @DisplayName("nameInquiryTest Анастасия")
    @Test
    public void nameInquiryTest2(){
        Assertions.assertEquals("Я тебя так долго ждал", NameInquiryIfElseIf.nameInquiryIfElseIf("Анастасия"));
    }

    @DisplayName("nameInquiryTest other name")
    @Test
    public void nameInquiryTest3(){
        Assertions.assertEquals("Добрый день! А вы кто?", NameInquiryIfElseIf.nameInquiryIfElseIf("Петя"));
    }
}