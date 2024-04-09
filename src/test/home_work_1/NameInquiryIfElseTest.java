package test.home_work_1;

import home_work_1.NameInquiryIfElse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NameInquiryIfElseTest {

    @DisplayName("nameInquiryTest Вася")
    @Test
    public void nameInquiryTest1(){
        Assertions.assertEquals("Привет!" + "\n" + "Я тебя так долго ждал", NameInquiryIfElse.nameInquiryIfElse("Вася"));
    }

    @DisplayName("nameInquiryTest Анастасия")
    @Test
    public void nameInquiryTest2(){
        Assertions.assertEquals("Я тебя так долго ждал", NameInquiryIfElse.nameInquiryIfElse("Анастасия"));
    }

    @DisplayName("nameInquiryTest other name")
    @Test
    public void nameInquiryTest3(){
        Assertions.assertEquals("Добрый день! А вы кто?", NameInquiryIfElse.nameInquiryIfElse("Петя"));
    }
}