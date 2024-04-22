package home_work_5.comparators;

import home_work_5.dto.Person;

import java.util.Comparator;

public class ComparatorPassLengthThenNickAlphOrder implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        if (Integer.compare(o1.getPassword().length(), o2.getPassword().length()) < 0){
            return -1;
        }
        if (Integer.compare(o1.getPassword().length(), o2.getPassword().length()) > 0){
            return 1;
        }
        return o1.getNick().compareTo(o2.getNick());
    }
}
