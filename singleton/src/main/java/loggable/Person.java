package loggable;

import logger.LogColor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static logger.LoggerUtil.Color.ANSI_BLUE;

@LogColor(ANSI_BLUE)
@Component
@Scope("prototype")
public class Person extends Loggable {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
