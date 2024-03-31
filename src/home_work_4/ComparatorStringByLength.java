package home_work_4;

import java.util.Comparator;

public class ComparatorStringByLength implements Comparator<String> {


    @Override
    public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
    }
}
