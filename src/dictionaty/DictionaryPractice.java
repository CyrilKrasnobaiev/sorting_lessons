package dictionaty;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

    public static void main (String[] args) {

        //English to spanish dictionary
        var englSpanDictionary = new HashMap<String, String>();

        //putting things inside our dictionary
        englSpanDictionary.put("Monday", "Lunes");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miercoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "Viernes");
        englSpanDictionary.put("Saturday", "Sabado");
        englSpanDictionary.put("Sunday", "Domingo");

        //retrieve things from dictionary
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));

        //print aout all keys
        System.out.println(englSpanDictionary.keySet());
        //print aout all values
        System.out.println(englSpanDictionary.values());

        //print aout all values
        System.out.println("The size of our dictionary is " + englSpanDictionary.size());

        System.out.println();
        System.out.println();

        //Shopping list
        var shoppingList = new HashMap<String,Boolean>();
        //put some stuff in dictionary
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Sugar", false);

        //Retrieve items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Sugar"));

        //print key - value pairs
        System.out.println(shoppingList);
        //remove things
        shoppingList.remove("Eggs");
        //replace value
        shoppingList.replace("Bread", Boolean.FALSE);
        System.out.println(shoppingList);

        shoppingList.clear();
        System.out.println(shoppingList);
        System.out.println(shoppingList.isEmpty());

    }
}
