package home_work_6.search;

import home_work_6.search.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        String optimizationToIgnoreSpecialSymbols = Pattern.quote(word);

        Pattern pattern = Pattern.compile("\\b" + optimizationToIgnoreSpecialSymbols + "\\b");
        Matcher matcher = pattern.matcher(text);

        long count = 0;
        while (matcher.find()){
            count++;
        }
        return count;
    }
}
