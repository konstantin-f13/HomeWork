package home_work_6.runners;

import home_work_6.*;

import java.io.File;

public class HomeWork6Main {
    public static void main(String[] args) {
        File file = new File("Война и мир_книга.txt");
        System.out.println("Файл с книгой существует? " + file.exists());

        System.out.println("Количество всех использованных слов без учета повторных: " + Task2_1.uniqueWordsInBookCount(Task2_1.stringSplitter(Task2_1.stringBuilderFromFile(file))));
        System.out.println("Самое часто встречающееся слово в книге: " + Task2_2.identifyMostCommonWords(Task2_1.stringSplitter(Task2_1.stringBuilderFromFile(file)), 1));
        System.out.println("200 самых часто встречающихся слов в книге: " + Task2_2.identifyMostCommonWords(Task2_1.stringSplitter(Task2_1.stringBuilderFromFile(file)), 200));
        System.out.println("1000 самых часто встречающихся слов в книге: " + Task2_2.identifyMostCommonWords(Task2_1.stringSplitter(Task2_1.stringBuilderFromFile(file)), 1000));

        System.out.println("_______Класс EasySearch_______");
        System.out.println("Слово \"Марью\" встречается в файле " + new EasySearch().search(Task2_1.stringBuilderFromFile(file), "Марью") + " раз");
        System.out.println("Слово \"война\" встречается в файле " + new EasySearch().search(Task2_1.stringBuilderFromFile(file), "война") + " раз");
        System.out.println("Слово \"и\" встречается в файле " + new EasySearch().search(Task2_1.stringBuilderFromFile(file), " и ") + " раз");
        System.out.println("Слово \"мир\" встречается в файле " + new EasySearch().search(Task2_1.stringBuilderFromFile(file), "мир") + " раз");

        System.out.println("_______Класс RegExSearch_______");
        System.out.println("Слово \"Марью\" встречается в файле " + new RegExSearch().search(Task2_1.stringBuilderFromFile(file),"Марью") + " раз");
        System.out.println("Слово \"война\" встречается в файле " + new RegExSearch().search(Task2_1.stringBuilderFromFile(file),"война") + " раз");
        System.out.println("Слово \"и\" встречается в файле " + new RegExSearch().search(Task2_1.stringBuilderFromFile(file),"и") + " раз");
        System.out.println("Слово \"мир\" встречается в файле " + new RegExSearch().search(Task2_1.stringBuilderFromFile(file),"мир") + " раз");

        System.out.println("_______Класс SearchEnginePunctuationNormalizer_______");
        System.out.println("Слово \"Марью\" встречается в файле " + new SearchEnginePunctuationNormalizer(new RegExSearch()).search(Task2_1.stringBuilderFromFile(file),"Марью") + " раз");
        System.out.println("Слово \"война\" встречается в файле " + new SearchEnginePunctuationNormalizer(new RegExSearch()).search(Task2_1.stringBuilderFromFile(file),"война") + " раз");
        System.out.println("Слово \"и\" встречается в файле " + new SearchEnginePunctuationNormalizer(new RegExSearch()).search(Task2_1.stringBuilderFromFile(file),"и") + " раз");
        System.out.println("Слово \"мир\" встречается в файле " + new SearchEnginePunctuationNormalizer(new RegExSearch()).search(Task2_1.stringBuilderFromFile(file),"мир") + " раз");

        System.out.println("_______Класс CaseInsensitiveDecorator_______ВНЕ ЗАВИСИМОСТИ ОТ РЕГИСТРА!");
        System.out.println("Слово \"Марью\" встречается в файле " + new CaseInsensitiveDecorator(new RegExSearch()).search(Task2_1.stringBuilderFromFile(file),"Марью") + " раз");
        System.out.println("Слово \"война\" встречается в файле " + new CaseInsensitiveDecorator(new RegExSearch()).search(Task2_1.stringBuilderFromFile(file),"война") + " раз");
        System.out.println("Слово \"и\" встречается в файле " + new CaseInsensitiveDecorator(new RegExSearch()).search(Task2_1.stringBuilderFromFile(file),"и") + " раз");
        System.out.println("Слово \"мир\" встречается в файле " + new CaseInsensitiveDecorator(new RegExSearch()).search(Task2_1.stringBuilderFromFile(file),"мир") + " раз");


    }
}
