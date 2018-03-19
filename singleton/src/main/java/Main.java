import loggable.Cat;
import loggable.Loggable;
import loggable.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Loggable> loggableList = new ArrayList();

        loggableList.add(new Person("Antoine", "Caron"));
        loggableList.add(new Person("Philippe", "Charrière"));
        loggableList.add(new Cat("Garfield"));
        loggableList.add(new Person("Christine", "Gertosio"));
        loggableList.add(new Person("Christian", "Vial"));
        loggableList.add(new Cat("Felix"));
        loggableList.add(new Person("Laetitia", "Matignon"));

        loggableList.forEach(Loggable::log);
    }
}
