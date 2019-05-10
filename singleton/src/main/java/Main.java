import loggable.Cat;
import loggable.Loggable;
import loggable.Person;
import logger.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        List<Loggable> loggableList = new ArrayList<>();

        loggableList.add(context.getBean(Person.class, "Antoine", "Caron"));
        loggableList.add(context.getBean(Person.class,"Philippe", "Charrière"));
        loggableList.add(context.getBean(Cat.class,"Garfield"));
        loggableList.add(context.getBean(Person.class,"Christine", "Gertosio"));
        loggableList.add(context.getBean(Person.class,"Christian", "Vial"));
        loggableList.add(context.getBean(Cat.class,"Felix"));
        loggableList.add(context.getBean(Person.class,"Laetitia", "Matignon"));

        loggableList.forEach(Loggable::log);
    }
}
