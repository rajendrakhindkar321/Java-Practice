import java.util.Scanner;

public class CalculatorOp {

    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the two numbers");
    double first = sc.nextDouble();
    double second = sc.nextDouble();

    System.out.println("Enter the operator(+, -, *, /): ");

    char ch = sc.next().charAt(0);

    double result;

    switch(ch)

    {

        case '+':
            result = first + second;
            break;

        case '-':
            result = first - second;
            break;

        case '*':
            result = first * second;
            break;

        case '/':
            result = first / second;
            break;

        default:
            System.out.println("Error! Operator is incorrect");
            return;
     }

        System.out.printf("%.1f %c %.1f = %.1f", first, ch, second, result);

    }

}
