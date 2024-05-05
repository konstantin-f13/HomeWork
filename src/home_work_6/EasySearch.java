package home_work_6;

import home_work_6.api.ISearchEngine;

public class EasySearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        int lastIndex = 0;
        long count = 0;

        while (lastIndex != -1) {
            lastIndex = text.indexOf(word, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += word.length();
            }
        }
        return count;
    }
}
