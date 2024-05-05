package home_work_6;

import home_work_6.comparators.ComparatorForMapsByValue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Task2_2 {
    public static String identifyMostCommonWords(String[] words, int popularity) {
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
