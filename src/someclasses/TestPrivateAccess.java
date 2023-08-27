package someclasses;

import someclasses.SomeClass;

import java.lang.reflect.Field;

public class TestPrivateAccess {

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();

        try {
            Field reflectField = SomeClass.class.getDeclaredField("name"); //NoSuchFieldException e
            Field reflectField2 = SomeClass.class.getDeclaredField("x"); //NoSuchFieldException e

            /* Если не дать доступ, то будет ошибка
            java.lang.IllegalAccessException: Class .. .someclasses.TestPrivateAccess
            can not access a member of class .. .SomeClass with modifiers "private"
            */
            reflectField.setAccessible(true);
            reflectField2.setAccessible(true);

            String nameValue = (String) reflectField.get(someClass); //IllegalAccessException ex
            Integer xValue = (Integer) reflectField2.get(someClass); //IllegalAccessException ex

            System.out.println(reflectField);//private java.lang.String ru.javastudy.interview.oop.privateFieldAccess.SomeClass.name
            System.out.println(nameValue); //SomeNameString

            System.out.println(reflectField2);//private java.lang.Integer ru.javastudy.interview.oop.privateFieldAccess.SomeClass.x
            System.out.println(xValue); //25
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();;
        }

    }
}
