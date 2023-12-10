public class NullPointerExceptionExample {
    public static void main(String[] args) {

        String str = null;

        try {

            if (str.equals("Rajendra")) {
                System.out.println("String are the same");
            } else {
                System.out.println("String are not the same");
            }
        }
            catch(NullPointerException e){
                System.out.print("NullPointerException has been caught.");
            }
    }
}
