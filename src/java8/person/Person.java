package java8.person;

import static java8.person.HairColor.BLONDE;

public class Person {
    String name;
    String lastName;
    private int age;

    HairColor hairColor = BLONDE;

    public Person(HairColor hairColor) {
        this.hairColor = hairColor;
    }

    Person() {
    }

    public Person(String firstName, String lastName) {
        this.name = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, int age) {
        this.name = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return name;
    }

    public void setFirstName(String firstName) {
        this.name = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public void setHairColor(HairColor hairColor) {
        this.hairColor = hairColor;
    }

    public String toString() {
        return "Person [" + this.name + ", " + this.age + "]";
    }
}
