import java.util.Scanner;

public class BooleanInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean(); // Reads a boolean value from the console

        if (isStudent) {
            System.out.println("You are a student!");
        } else {
            System.out.println("You are not a student.");
        }

        scanner.close(); // Remember to close the scanner when done reading input
    }
}
