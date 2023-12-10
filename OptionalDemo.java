import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        String str = "hello rajendra";

        Optional<String> optional = Optional.ofNullable(str);
        if(optional.isPresent()) {
            System.out.println("Value is present: " + optional.get());
        }
        else{
            String defaultName = optional.orElse("Default");
            System.out.println("Value is not present: " + defaultName);
        }
     //   Using ifPresent() to perform an action if the value is present
        optional.ifPresent(str2 -> System.out.println("String Found: " + str2));

        //Mapping the value if present
        optional.map(String::toUpperCase)
                .ifPresent(upperName -> System.out.println("Uppercase name: " + upperName));
    }

}
