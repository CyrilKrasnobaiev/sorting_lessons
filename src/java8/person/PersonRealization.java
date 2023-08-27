package java8.person;

import static java8.person.HairColor.PINK;

public class PersonRealization {

    public static void main(String[] args) {
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");
        System.out.println(person.name);
        System.out.println(person.lastName);


        Person peterParker = new Person();
        Person spiderMan = peterParker;

        spiderMan.hairColor = PINK;

        System.out.println("Hair color of Peter Parker: " + peterParker.hairColor);
        System.out.println("Hair color of SpiderMan: " + spiderMan.hairColor);


    }
}
