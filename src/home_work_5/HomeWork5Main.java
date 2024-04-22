package home_work_5;

import home_work_5.dto.Animal;
import home_work_5.dto.Person;
import home_work_5.utils.RandomGeneratorsUtils;
import home_work_5.utils.RealNameOfAnimalGenerator;
import home_work_5.utils.RealNameOfPeopleGenerator;

public class HomeWork5Main {
    public static void main(String[] args) {
        Person person1 = new Person(RandomGeneratorsUtils.generateRandomString(), RandomGeneratorsUtils.passwordGenerator(), RandomGeneratorsUtils.generateRandomString());
        Person person2 = new Person(RandomGeneratorsUtils.generateRandomEnglishString(), RandomGeneratorsUtils.passwordGenerator(), RandomGeneratorsUtils.generateRandomRussianString());
        Person person3 = new Person(RandomGeneratorsUtils.generateRandomString(), RandomGeneratorsUtils.passwordGenerator(), new RealNameOfPeopleGenerator().generateRandomRealName());
        Person person4 = new Person(RandomGeneratorsUtils.generateRandomEnglishString(), RandomGeneratorsUtils.passwordGenerator(), new RealNameOfPeopleGenerator().generateRandomRealName());
        Person person5 = new Person(RandomGeneratorsUtils.generateRandomString(), RandomGeneratorsUtils.passwordGenerator(), new RealNameOfPeopleGenerator().generateRandomRealName());

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);

        Animal animal1 = new Animal(RandomGeneratorsUtils.generateRandomString());
        Animal animal2 = new Animal(RandomGeneratorsUtils.generateRandomRussianString());
        Animal animal3 = new Animal(new RealNameOfAnimalGenerator().generateRandomRealName());
        Animal animal4 = new Animal(new RealNameOfAnimalGenerator().generateRandomRealName());
        Animal animal5 = new Animal(new RealNameOfAnimalGenerator().generateRandomRealName());

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
        System.out.println(animal4);
        System.out.println(animal5);

    }
}
