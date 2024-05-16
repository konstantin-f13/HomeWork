package test.home_work_6;

import home_work_6.search.EasySearch;
import home_work_6.search.decorators.SearchEnginePunctuationNormalizer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SEPunctuationNormalizerTest {
    @DisplayName("Поиск дважды встречающегося слова")
    @Test
    public void search1() {
        Assertions.assertEquals(2, new SearchEnginePunctuationNormalizer(new EasySearch()).search("Мама мыла раму и мыла её хорошо.", "мыла"));
    }

    @DisplayName("Поиск отдельной части слова")
    @Test
    public void search2() {
        Assertions.assertEquals(0, new SearchEnginePunctuationNormalizer(new EasySearch()).search("Мама мыла раму.", "мыл"));
    }

    @DisplayName("Поиск при разном регистре.")
    @Test
    public void search3() {
        Assertions.assertEquals(1, new SearchEnginePunctuationNormalizer(new EasySearch()).search("Мыл МЫЛ мыл.", "мыл"));
    }

    @DisplayName("Поиск слова с запятой после слова.")
    @Test
    public void search4() {
        Assertions.assertEquals(1, new SearchEnginePunctuationNormalizer(new EasySearch()).search("привет, как дела!", "привет"));
    }

    @DisplayName("Поиск слова с восклицательным знаком после слова.")
    @Test
    public void search5() {
        Assertions.assertEquals(1, new SearchEnginePunctuationNormalizer(new EasySearch()).search("привет, как дела!", "дела"));
    }

    @DisplayName("Поиск двух слепленных слов.")
    @Test
    public void search6() {
        Assertions.assertEquals(1, new SearchEnginePunctuationNormalizer(new EasySearch()).search("привет,какдела!", "какдела"));
    }

    @DisplayName("Поиск слова с \";\" после слова.")
    @Test
    public void search7() {
        Assertions.assertEquals(1, new SearchEnginePunctuationNormalizer(new EasySearch()).search("привет;какдела!", "привет"));
    }

    @DisplayName("Поиск слова с \";\" перед словом и ! после слова.")
    @Test
    public void search8() {
        Assertions.assertEquals(1, new SearchEnginePunctuationNormalizer(new EasySearch()).search("привет;какдела!", "какдела"));
    }

    @DisplayName("Поиск слова с начала строки.")
    @Test
    public void search9() {
        Assertions.assertEquals(1, new SearchEnginePunctuationNormalizer(new EasySearch()).search("привет, пока", "привет"));
    }

    @DisplayName("Поиск слова в конце строки.")
    @Test
    public void search10() {
        Assertions.assertEquals(1, new SearchEnginePunctuationNormalizer(new EasySearch()).search("привет, пока", "пока"));
    }

    @DisplayName("Поиск слова, за которым следуют 2 символа.")
    @Test
    public void search11() {
        Assertions.assertEquals(1, new SearchEnginePunctuationNormalizer(new EasySearch()).search("как дела!.Что делаешь?", "дела"));
    }

    @DisplayName("Поиск слова, перед которым следуют 2 символа.")
    @Test
    public void search12() {
        Assertions.assertEquals(1, new SearchEnginePunctuationNormalizer(new EasySearch()).search("как дела!.Что делаешь?", "Что"));
    }



}
