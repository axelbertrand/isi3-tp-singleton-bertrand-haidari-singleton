package loggable;

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
