
class AgeInvalidException extends Exception{

    AgeInvalidException(){
        super("Age is Invalid!");
    }

    AgeInvalidException(String message){
        super(message);
    }
}
public class ExceptionDemo {

    public static void main(String[] args) {
 try {
     System.out.println("Started...");

     int age = 23;
     int n1 = Integer.parseInt(args[0]);
     int n2 = Integer.parseInt(args[1]);
     System.out.println("We got two numbers");
     int result = n1 / n2;
     System.out.println("Divinsion is " + result);


     if(age >0){
         throw new AgeInvalidException("Your Age is Valid!");

     }else{
         throw new AgeInvalidException("Your Age is not Valid!");
     }

 }
 catch(Exception e){
     System.out.println("Invalid Numbers!!");
     System.out.println(e.getMessage());
 }

 finally {
     System.out.println("We are in finally block.");
     System.out.println("Closing all the resources...");
     System.out.println("Terminted...");
 }
    }
}
