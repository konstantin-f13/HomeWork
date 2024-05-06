package test.home_work_6;

import home_work_6.RegExSearch;
import home_work_6.SearchEnginePunctuationNormalizer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SEPunctuationNormalizerTest {
    @DisplayName("Проверка на дважды встречающееся слово")
    @Test
    public void search1() {
        Assertions.assertEquals(2, new SearchEnginePunctuationNormalizer(new RegExSearch()).search("Мама мыла раму и мыла её хорошо.", "мыла"));
    }

    @DisplayName("Проверка на поиск части слова")
    @Test
    public void search2() {
        Assertions.assertEquals(0, new SearchEnginePunctuationNormalizer(new RegExSearch()).search("Мама мыла раму и мыла её хорошо.", "мыл"));
    }

    @DisplayName("Проверка на поиск отдельно стоящих слов - между пробелами.")
    @Test
    public void search3() {
        Assertions.assertEquals(1, new SearchEnginePunctuationNormalizer(new RegExSearch()).search("Папа мыл раму, он хорошо её мыл.", " мыл "));
    }

    @DisplayName("Проверка на поиск при разном регистре.")
    @Test
    public void search4() {
        Assertions.assertEquals(1, new SearchEnginePunctuationNormalizer(new RegExSearch()).search("Мыл МЫЛ мыл поМыл.", "мыл"));
    }

}
