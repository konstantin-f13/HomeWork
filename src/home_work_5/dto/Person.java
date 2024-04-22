package home_work_5.dto;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String nick;
    private String password;
    private String name;

    public Person(String nick, String password, String name) {
        this.nick = nick;
        setPassword(password);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    private void setPassword(String password) {
        if (password.length() >= 5 && password.length() <= 10) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("Пароль должен быть длиной от 5 до 10 символов.");
        }
    }

    public String getPassword() {
        return password;
    }

    public String getNick() {
        return nick;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(nick, person.nick) && Objects.equals(password, person.password) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick, password, name);
    }

    @Override
    public int compareTo(Person o) {
        int nickComparison = this.nick.compareTo(o.nick);
        if (nickComparison != 0) {
            return nickComparison;
        }
        return this.name.compareTo(o.name);
    }
}
