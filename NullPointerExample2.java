public class NullPointerExample2 {
    public void demo(){
        System.out.println("In the demo method");
    }

    public static void main(String[] args) {
        //Computing the size or length of the Null as if it were an array of elements.

        String arr[] = null;
        System.out.println("The length of the array arr is: " + arr.length);

        //Calling a method using the object that has the Null value.

        NullPointerExample2 obj = null;
        obj.demo();
    }
}