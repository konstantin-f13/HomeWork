package test.home_work_1;

import home_work_1.NameInquiryIfElseIf;
import home_work_1.NameInquirySwitch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NameInquirySwitchTest {

    @DisplayName("nameInquiryTest Вася")
    @Test
    public void nameInquiryTest1(){
        Assertions.assertEquals("Привет!" + "\n" + "Я тебя так долго ждал", NameInquirySwitch.nameInquirySwitch("Вася"));
    }

    @DisplayName("nameInquiryTest Анастасия")
    @Test
    public void nameInquiryTest2(){
        Assertions.assertEquals("Я тебя так долго ждал", NameInquirySwitch.nameInquirySwitch("Анастасия"));
    }

    @DisplayName("nameInquiryTest other name")
    @Test
    public void nameInquiryTest3(){
        Assertions.assertEquals("Добрый день! А вы кто?", NameInquirySwitch.nameInquirySwitch("Петя"));
    }
}