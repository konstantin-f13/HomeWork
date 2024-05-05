package home_work_6;

import home_work_6.comparators.ComparatorForMapsByValue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Task2_2 {
    public static String identifyMostCommonWords(File file, int popularity) {

        String result = "";

        try {
            FileReader reader = new FileReader(file);
            StringBuilder builder = new StringBuilder();

            int ch;
            while ((ch = reader.read()) != -1) {
                builder.append((char) ch);
            }
            result = builder.toString();
        } catch (FileNotFoundException e) {
            System.out.println("Не найден файл");
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        }


        String[] words = result.split("[\\s\\p{Punct}&&[^-]]+|\\d+|(?<!\\S)--(?!\\S)");

        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            if (wordFrequency.containsKey(word)) {
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            } else {
                wordFrequency.put(word, 1);
            }
        }
        ArrayList<Map.Entry<String, Integer>> keyValueList = new ArrayList<>(wordFrequency.entrySet());
        Collections.sort(keyValueList, new ComparatorForMapsByValue());

        boolean comma = false;
        String endResult = "";
        for (int i = 0; i < popularity; i++) {
            if (comma){
                endResult += ", ";
            } else {
                comma = true;
            }
            endResult += keyValueList.get(i).getKey() + " - " + keyValueList.get(i).getValue() + " раз";
        }
        return endResult;
    }
}
