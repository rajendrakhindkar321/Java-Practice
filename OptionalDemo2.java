// Without Using Optional (Handling NullPointerException)

import org.w3c.dom.ls.LSOutput;

class Person {

    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
public class OptionalDemo2 {

    public static void main(String[] args) {
        Person person = new Person(null);

        String name = person.getName();

        System.out.println("Name is " + name);
    }

}
