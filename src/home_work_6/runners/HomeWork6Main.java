package home_work_6.runners;

import home_work_6.*;
import home_work_6.search.EasySearch;
import home_work_6.search.RegExSearch;
import home_work_6.search.decorators.CaseInsensitiveDecorator;
import home_work_6.search.decorators.SearchEnginePunctuationNormalizer;

import java.io.File;

public class HomeWork6Main {
    public static void main(String[] args) {
        File file = new File("HomeWork/src/home_work_6/txt_books/war_and_peace/Война и мир_книга.txt");
        System.out.println("Файл с книгой существует? " + file.exists());
        String text = Task2_1.stringBuilderFromFile(file);
        String[] splitText = Task2_1.stringSplitter(text);

        System.out.println("Количество всех использованных слов без учета повторных: " + Task2_1.uniqueWordsInBookCount(splitText));
        System.out.println("Самое часто встречающееся слово в книге: " + Task2_2.identifyMostCommonWords(splitText, 1));
        System.out.println("200 самых часто встречающихся слов в книге: " + Task2_2.identifyMostCommonWords(splitText, 200));
        System.out.println("1000 самых часто встречающихся слов в книге: " + Task2_2.identifyMostCommonWords(splitText, 1000));

        System.out.println("_______Класс EasySearch_______");
        System.out.println("Слово \"Марью\" встречается в файле " + new EasySearch().search(text, "Марью") + " раз");
        System.out.println("Слово \"война\" встречается в файле " + new EasySearch().search(text, "война") + " раз");
        System.out.println("Слово \"и\" встречается в файле " + new EasySearch().search(text, " и ") + " раз");
        System.out.println("Слово \"мир\" встречается в файле " + new EasySearch().search(text, "мир") + " раз");

        System.out.println("_______Класс RegExSearch_______");
        System.out.println("Слово \"Марью\" встречается в файле " + new RegExSearch().search(text,"Марью") + " раз");
        System.out.println("Слово \"война\" встречается в файле " + new RegExSearch().search(text,"война") + " раз");
        System.out.println("Слово \"и\" встречается в файле " + new RegExSearch().search(text,"и") + " раз");
        System.out.println("Слово \"мир\" встречается в файле " + new RegExSearch().search(text,"мир") + " раз");

        System.out.println("_______Класс SearchEnginePunctuationNormalizer_______");
        System.out.println("Слово \"Марью\" встречается в файле " + new SearchEnginePunctuationNormalizer(new EasySearch()).search(text,"Марью") + " раз");
        System.out.println("Слово \"война\" встречается в файле " + new SearchEnginePunctuationNormalizer(new EasySearch()).search(text,"война") + " раз");
        System.out.println("Слово \"и\" встречается в файле " + new SearchEnginePunctuationNormalizer(new EasySearch()).search(text,"и") + " раз");
        System.out.println("Слово \"мир\" встречается в файле " + new SearchEnginePunctuationNormalizer(new EasySearch()).search(text,"мир") + " раз");

        System.out.println("_______Класс CaseInsensitiveDecorator_______ВНЕ ЗАВИСИМОСТИ ОТ РЕГИСТРА!");
        System.out.println("Слово \"Марью\" встречается в файле " + new CaseInsensitiveDecorator(new EasySearch()).search(text,"Марью") + " раз");
        System.out.println("Слово \"война\" встречается в файле " + new CaseInsensitiveDecorator(new EasySearch()).search(text,"война") + " раз");
        System.out.println("Слово \"и\" встречается в файле " + new CaseInsensitiveDecorator(new EasySearch()).search(text,"и") + " раз");
        System.out.println("Слово \"мир\" встречается в файле " + new CaseInsensitiveDecorator(new EasySearch()).search(text,"мир") + " раз");

    }
}
