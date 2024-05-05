package home_work_6.runners;

import home_work_6.Task2_1;
import home_work_6.Task2_2;

import java.io.File;

public class HomeWork6Main {
    public static void main(String[] args) {
        File file = new File("Война и мир_книга.txt");
        System.out.println("Файл с книгой существует? " + file.exists());

        System.out.println("Количество всех использованных слов без учета повторных: " + Task2_1.uniqueWordsInBookCount(Task2_1.stringSplitter(file)));


        System.out.println("Самое часто встречающееся слово в книге: " + Task2_2.identifyMostCommonWords(Task2_1.stringSplitter(file), 1));
        System.out.println("200 самых часто встречающихся слов в книге: " + Task2_2.identifyMostCommonWords(Task2_1.stringSplitter(file), 200));
    }
}
