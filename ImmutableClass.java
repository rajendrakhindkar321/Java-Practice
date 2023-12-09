//Declare class as final
//make all fields private
//don't provide setter methods
//make all mutable fields final
//Initialize all the fields via a constructor
//Perfrom cloning of object
public final class ImmutableClass implements Cloneable{

    private final int id;
    private final String name;

    public ImmutableClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public static void main(String args[]) throws CloneNotSupportedException {

        ImmutableClass a = new ImmutableClass(1, "Rajendra");
        ImmutableClass b = (ImmutableClass)a.clone();

        System.out.println(b.id == 1);
        System.out.println(b.name == "Rajendra");

    }
}
