import java.util.Optional;

// Using Optional to Handle NullPointerException
class Person2{

    private String name;

    public Person2(String name){
        this.name = name;
    }

    public Optional<String> getName(){

        return Optional.ofNullable(name);
    }
}
public class OptionalDemo3 {

    public static void main(String[] args) {

        Person2 person = new Person2(null);

        Optional<String> optional = person.getName();

        if(optional.isPresent()){
            String name = optional.get();
            System.out.println("Name is " + name);
        }else {
            System.out.println("Name is not found");
        }
    }
}
