package home_work_5.comparators;

import home_work_5.dto.Person;

import java.util.Comparator;

public class ComparatorPasswordByLength implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {

        return Integer.compare(o1.getPassword().length(), o2.getPassword().length());
    }
}
