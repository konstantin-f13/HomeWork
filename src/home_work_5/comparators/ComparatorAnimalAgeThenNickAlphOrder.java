package home_work_5.comparators;

import home_work_5.dto.Animal;

import java.util.Comparator;

public class ComparatorAnimalAgeThenNickAlphOrder implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        if (Integer.compare(o1.getAge(), o2.getAge()) < 0){
            return -1;
        }
        if (Integer.compare(o1.getAge(), o2.getAge()) > 0){
            return 1;
        }
        return o1.getNick().compareTo(o2.getNick());
    }
}
