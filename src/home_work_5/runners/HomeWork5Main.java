package home_work_5.runners;

import home_work_5.comparators.ComparatorPassLengthThenNickAlphOrder;
import home_work_5.comparators.ComparatorPasswordByLength;
import home_work_5.dto.Person;
import home_work_5.utils.RandomGeneratorsUtils;

import java.util.*;

public class HomeWork5Main {
    public static void main(String[] args) {
//        Person person1 = new Person(RandomGeneratorsUtils.generateRandomString(), RandomGeneratorsUtils.passwordGenerator(), RandomGeneratorsUtils.generateRandomString());
//        Person person2 = new Person(RandomGeneratorsUtils.generateRandomEnglishString(), RandomGeneratorsUtils.passwordGenerator(), RandomGeneratorsUtils.generateRandomRussianString());
//        Person person3 = new Person(RandomGeneratorsUtils.generateRandomString(), RandomGeneratorsUtils.passwordGenerator(), new RealNameOfPeopleGenerator().generateRandomRealName());
//        Person person4 = new Person(RandomGeneratorsUtils.generateRandomEnglishString(), RandomGeneratorsUtils.passwordGenerator(), new RealNameOfPeopleGenerator().generateRandomRealName());
//        Person person5 = new Person(RandomGeneratorsUtils.generateRandomString(), RandomGeneratorsUtils.passwordGenerator(), new RealNameOfPeopleGenerator().generateRandomRealName());
//
//        System.out.println(person1);
//        System.out.println(person2);
//        System.out.println(person3);
//        System.out.println(person4);
//        System.out.println(person5);
//
//        Animal animal1 = new Animal(RandomGeneratorsUtils.generateRandomString());
//        Animal animal2 = new Animal(RandomGeneratorsUtils.generateRandomRussianString());
//        Animal animal3 = new Animal(new RealNameOfAnimalGenerator().generateRandomRealName());
//        Animal animal4 = new Animal(new RealNameOfAnimalGenerator().generateRandomRealName());
//        Animal animal5 = new Animal(new RealNameOfAnimalGenerator().generateRandomRealName());
//
//        System.out.println(animal1);
//        System.out.println(animal2);
//        System.out.println(animal3);
//        System.out.println(animal4);
//        System.out.println(animal5);
//        System.out.println("____________________");


/**
 * Создание пустых списков LinkedList и ArrayList, и пустых сетов HashSet и TreeSet.
 */
        LinkedList<Person> linkedListPeople = new LinkedList<Person>();
        ArrayList<Person> arrayListPeople = new ArrayList<Person>();
        HashSet<Person> hashSetPeople = new HashSet<Person>();
        TreeSet<Person> treeSetPeople = new TreeSet<Person>();

        long start = System.currentTimeMillis();
/**
 * Заполняем пустые списки и сеты рандомными объектами.
 */
        for (int i = 0; i < 100_000; i++) {
            linkedListPeople.add(new Person(RandomGeneratorsUtils.generateRandomString(),
                    RandomGeneratorsUtils.passwordGenerator(),
                    RandomGeneratorsUtils.generateRandomString()));
        }
        long stop = System.currentTimeMillis();
        System.out.println("Операция заполнения списка LinkedList linkedListPeople заняла: "  + (stop - start) + "мс");

        start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            arrayListPeople.add(new Person(RandomGeneratorsUtils.generateRandomString(),
                    RandomGeneratorsUtils.passwordGenerator(),
                    RandomGeneratorsUtils.generateRandomString()));
        }
        stop = System.currentTimeMillis();
        System.out.println("Операция заполнения списка ArrayList arrayListPeople заняла: "  + (stop - start) + "мс");

        start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            hashSetPeople.add(new Person(RandomGeneratorsUtils.generateRandomString(),
                    RandomGeneratorsUtils.passwordGenerator(),
                    RandomGeneratorsUtils.generateRandomString()));
        }
        stop = System.currentTimeMillis();
        System.out.println("Операция заполнения списка HashSet hashSetPeople заняла: "  + (stop - start) + "мс");

        start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            treeSetPeople.add(new Person(RandomGeneratorsUtils.generateRandomString(),
                    RandomGeneratorsUtils.passwordGenerator(),
                    RandomGeneratorsUtils.generateRandomString()));
        }
        stop = System.currentTimeMillis();
        System.out.println("Операция заполнения списка TreeSet treeSetPeople заняла: "  + (stop - start) + "мс");

        System.out.println("Количество элементов в LinkedList linkedListPeople " + linkedListPeople.size());
        System.out.println("Количество элементов в ArrayList arrayListPeople " + arrayListPeople.size());
        System.out.println("Количество элементов в HashSet hashSetPeople " + hashSetPeople.size());
        System.out.println("Количество элементов в TreeSet treeSetPeople " + treeSetPeople.size());

/**
 * Сортировка наполненных списков типа LinkedList & ArrayList
 */
        Collections.sort(linkedListPeople);
        linkedListPeople.sort(new ComparatorPasswordByLength());
        linkedListPeople.sort(new ComparatorPassLengthThenNickAlphOrder());

        Collections.sort(arrayListPeople);
        arrayListPeople.sort(new ComparatorPasswordByLength());
        arrayListPeople.sort(new ComparatorPassLengthThenNickAlphOrder());

/**
 * Кладём сеты hashSetPeople и treeSetPeople в списки типа ArrayList для последующей сортировки с использованием наших компараторов.
 */
        List<Person> sortedList1 = new ArrayList<>(hashSetPeople);
        Collections.sort(sortedList1, new ComparatorPasswordByLength());
        Collections.sort(sortedList1, new ComparatorPassLengthThenNickAlphOrder());

        List<Person> sortedList2 = new ArrayList<>(treeSetPeople);
        Collections.sort(sortedList2, new ComparatorPasswordByLength());
        Collections.sort(sortedList2, new ComparatorPassLengthThenNickAlphOrder());


        Iterator<Person> iterator1 = linkedListPeople.iterator();
        start = System.currentTimeMillis();
        while (iterator1.hasNext()){
            iterator1.next();
        }
        stop = System.currentTimeMillis();
        System.out.println("Операция итерирования LinkedList linkedListPeople через итератор заняла "  + (stop - start) + "мс");

        Iterator<Person> iterator2 = arrayListPeople.iterator();
        start = System.currentTimeMillis();
        while (iterator2.hasNext()){
            iterator2.next();
        }
        stop = System.currentTimeMillis();
        System.out.println("Операция итерирования ArrayList arrayListPeople через итератор заняла "  + (stop - start) + "мс");

        Iterator<Person> iterator3 = hashSetPeople.iterator();
        start = System.currentTimeMillis();
        while (iterator3.hasNext()){
            iterator3.next();
        }
        stop = System.currentTimeMillis();
        System.out.println("Операция итерирования HashSet hashSetPeople через итератор заняла "  + (stop - start) + "мс");

        Iterator<Person> iterator4 = treeSetPeople.iterator();
        start = System.currentTimeMillis();
        while (iterator4.hasNext()){
            iterator4.next();
        }
        stop = System.currentTimeMillis();
        System.out.println("Операция итерирования TreeSet treeSetPeople через итератор заняла "  + (stop - start) + "мс");

        start = System.currentTimeMillis();
        for (int i = 0; i < linkedListPeople.size(); i++) {
            linkedListPeople.get(i);
        }
        stop = System.currentTimeMillis();
        System.out.println("Операция итерирования LinkedList linkedListPeople через fori заняла "  + (stop - start) + "мс");

        start = System.currentTimeMillis();
        for (int i = 0; i < arrayListPeople.size(); i++) {
            arrayListPeople.get(i);
        }
        stop = System.currentTimeMillis();
        System.out.println("Операция итерирования ArrayList arrayListPeople через fori заняла "  + (stop - start) + "мс");

        /**
         * цикл fori для итерации HashSet и TreeSet не имеет смысла, т.к. в таких сетах отсутствует порядок по индексу.
         */

        iterator1 = linkedListPeople.iterator();
        start = System.currentTimeMillis();
        while (iterator1.hasNext()){
            iterator1.next();
            iterator1.remove();
        }
        stop = System.currentTimeMillis();
        System.out.println("Операция итерирования с удалением LinkedList linkedListPeople через итератор заняла "  + (stop - start) + "мс");
        if (linkedListPeople.isEmpty()) {
            System.out.println("Все элементы linkedListPeople были удалены успешно.");
        } else {
            System.out.println("Не удалось удалить все элементы linkedListPeople.");
        }

        iterator2 = arrayListPeople.iterator();
        start = System.currentTimeMillis();
        while (iterator2.hasNext()){
            iterator2.next();
            iterator2.remove();
        }
        stop = System.currentTimeMillis();
        System.out.println("Операция итерирования с удалением ArrayList arrayListPeople через итератор заняла "  + (stop - start) + "мс");
        if (arrayListPeople.isEmpty()) {
            System.out.println("Все элементы arrayListPeople были удалены успешно.");
        } else {
            System.out.println("Не удалось удалить все элементы arrayListPeople.");
        }

        iterator3 = hashSetPeople.iterator();
        start = System.currentTimeMillis();
        while (iterator3.hasNext()){
            iterator3.next();
            iterator3.remove();
        }
        stop = System.currentTimeMillis();
        System.out.println("Операция итерирования с удалением HashSet hashSetPeople через итератор заняла "  + (stop - start) + "мс");
        if (hashSetPeople.isEmpty()) {
            System.out.println("Все элементы hashSetPeople были удалены успешно.");
        } else {
            System.out.println("Не удалось удалить все элементы hashSetPeople.");
        }

        iterator4 = treeSetPeople.iterator();
        start = System.currentTimeMillis();
        while (iterator4.hasNext()){
            iterator4.next();
            iterator4.remove();
        }
        stop = System.currentTimeMillis();
        System.out.println("Операция итерирования с удалением TreeSet treeSetPeople через итератор заняла "  + (stop - start) + "мс");
        if (treeSetPeople.isEmpty()) {
            System.out.println("Все элементы treeSetPeople были удалены успешно.");
        } else {
            System.out.println("Не удалось удалить все элементы treeSetPeople.");
        }
    }
}
