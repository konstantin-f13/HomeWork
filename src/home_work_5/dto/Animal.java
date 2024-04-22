package home_work_5.dto;

import home_work_5.utils.RandomGeneratorsUtils;

import java.util.Objects;

public class Animal implements Comparable<Animal> {
    private int age;
    private String nick;

    public Animal(String nick) {
        this.age = RandomGeneratorsUtils.ageGenerator();
        this.nick = nick;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 15) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Возраст животного должен быть от 1 до 15 лет.");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", nick='" + nick + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }

    @Override
    public int compareTo(Animal o) {
        int ageComparison = Integer.compare(this.age, o.age);
        if (ageComparison == 0) {
            return this.nick.compareTo(o.nick);
        }
        return ageComparison;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(nick, animal.nick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, nick);
    }
}
