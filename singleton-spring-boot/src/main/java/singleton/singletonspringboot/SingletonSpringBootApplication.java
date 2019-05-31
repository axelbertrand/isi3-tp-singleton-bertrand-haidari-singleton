package singleton.singletonspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import singleton.singletonspringboot.loggable.Cat;
import singleton.singletonspringboot.loggable.Loggable;
import singleton.singletonspringboot.loggable.Person;
import singleton.singletonspringboot.logger.ConsoleLogger;
import singleton.singletonspringboot.logger.FileLogger;
import singleton.singletonspringboot.logger.Logger;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SingletonSpringBootApplication implements CommandLineRunner {
    private final ApplicationContext context;

    public static void main(String[] args) {
        SpringApplication.run(SingletonSpringBootApplication.class, args);
    }

    @Autowired
    public SingletonSpringBootApplication(ApplicationContext context) {
        this.context = context;
    }

    @Profile("consoleLogger")
    @Bean
    public Logger consoleLogger() {
        return new ConsoleLogger();
    }

    @Profile("fileLogger")
    @Bean
    public Logger fileLogger() {
        return new FileLogger();
    }

    @Override
    public void run(String... args) {
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
