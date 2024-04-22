package home_work_5.dto;

import home_work_5.utils.RandomGeneratorsUtils;

public class Animal {
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
}
