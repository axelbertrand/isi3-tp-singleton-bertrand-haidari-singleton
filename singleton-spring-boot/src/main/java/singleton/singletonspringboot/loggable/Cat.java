package singleton.singletonspringboot.loggable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import singleton.singletonspringboot.logger.LogColor;

@LogColor
@Component
@Scope("prototype")
public class Cat extends Loggable {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
