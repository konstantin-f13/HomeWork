package home_work_6.search.decorators;

import home_work_6.search.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {

    private ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        text = normalizeText(text);
        return searchEngine.search(text, word);
    }

    private String normalizeText(String text){
        text = text.replaceAll("\\p{Punct}", "");
        text = text.replaceAll("\\s+", " ");
        return text;
    }
}
