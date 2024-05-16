package test.home_work_6;

import home_work_6.Task2_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class StringSplitterTest {

    @DisplayName("Разбивка текста без знаков препинания.")
    @Test
    public void search1() {
        Assertions.assertEquals("[Мама, мыла, раму, и, мыла, её, хорошо]", Arrays.toString(Task2_1.stringSplitter("Мама мыла раму и мыла её хорошо.")));
    }

    @DisplayName("Разбивка текста с запятыми и воскл. знаком.")
    @Test
    public void search2() {
        Assertions.assertEquals("[привет, как, дела]", Arrays.toString(Task2_1.stringSplitter("привет, как дела!")));
    }

    @DisplayName("Разбивка текста со склеенными по ошибке словами.")
    @Test
    public void search3() {
        Assertions.assertEquals("[привет, какдела]", Arrays.toString(Task2_1.stringSplitter("привет,какдела!")));
    }

    @DisplayName("Разбивка текста с несколькими знаками подряд.")
    @Test
    public void search4() {
        Assertions.assertEquals("[как, дела, Что, делаешь]", Arrays.toString(Task2_1.stringSplitter("как дела!.Что делаешь?")));
    }

    @DisplayName("Разбивка текста со словом, написанным через дефис")
    @Test
    public void search5() {
        Assertions.assertEquals("[Привет-привет]", Arrays.toString(Task2_1.stringSplitter("Привет-привет")));
    }

    @DisplayName("Разбивка текста со словом, написанным через пробел и дефис")
    @Test
    public void search6() {
        Assertions.assertEquals("[Привет, привет]", Arrays.toString(Task2_1.stringSplitter("Привет -привет")));
    }

    @DisplayName("Разбивка текста с числом и словом через дефис")
    @Test
    public void search7() {
        Assertions.assertEquals("[4-х]", Arrays.toString(Task2_1.stringSplitter("4-х")));
    }

    @DisplayName("Разбивка текста, содержащего два слова и цифру.")
    @Test
    public void search8() {
        Assertions.assertEquals("[один, и, 1]", Arrays.toString(Task2_1.stringSplitter("один и 1")));
    }

    @DisplayName("Разбивка текста, содержащего одно и то же слово в разных падежах.")
    @Test
    public void search9() {
        Assertions.assertEquals("[бабушка, бабушке, бабушку]", Arrays.toString(Task2_1.stringSplitter("бабушка бабушке бабушку")));
    }





}
