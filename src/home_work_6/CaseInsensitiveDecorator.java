package home_work_6;

import home_work_6.api.ISearchEngine;

public class CaseInsensitiveDecorator implements ISearchEngine {
    private ISearchEngine searchEngine;

    public CaseInsensitiveDecorator(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        text = text.toLowerCase();
        word = word.toLowerCase();
        return searchEngine.search(text, word);
    }
}
