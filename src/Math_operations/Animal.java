package Math_operations;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animal {

    Integer classAreaVar2 = 25;

    public void anonymousClassTest() {
        final Integer[] localAreaVar = {25};
        //Анонимный класс
        ActionListener listener = e -> {
            //можно использовать переменные класса без указания final
            classAreaVar2 = classAreaVar2 + 25;

            //нельзя использовать локальные переменные, если они не final;
            /*Local variable is accessed from within inner class: needs to be declared final */
            localAreaVar[0] = localAreaVar[0] +5;
        };
    }
}
