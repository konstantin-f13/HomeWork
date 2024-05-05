package home_work_6.comparators;

import java.util.Comparator;
import java.util.Map;

public class ComparatorForMapsByValue implements Comparator<Map.Entry<String, Integer>>{


    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return o2.getValue().compareTo(o1.getValue());
    }
}
