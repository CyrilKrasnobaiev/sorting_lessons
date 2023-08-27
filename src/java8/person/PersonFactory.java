package java8.person;

public interface PersonFactory<P extends Person> {

    P create(String firstName, String lastName);
}
