package home_work_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class Task2_1 {

    public static String stringBuilderFromFile(File file) {

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

        return result;
    }

    public static String[] stringSplitter(String result){
        String[] words = result.split("[\\s\\p{Punct}&&[^-]]+|\\d+|(?<!\\S)--(?!\\S)");
        return words;

    }


    public static int uniqueWordsInBookCount(String[] words) {
        ArrayList<String> usedWords = new ArrayList<String>();
        for (String word : words) {
            if (!word.isEmpty()) {
                usedWords.add(word);
            }
        }
        HashSet<String> uniqueWords = new HashSet<String>(usedWords);
        return uniqueWords.size();

    }
}
