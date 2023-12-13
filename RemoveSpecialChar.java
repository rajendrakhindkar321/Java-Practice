import java.sql.SQLOutput;

public class RemoveSpecialChar {

    public static void main(String[] args) {
        
        String str = "Rajendra!@##$";
        int count = 0;
        String RemoveSpecialCharacter = "";


        for(char ch : str.toCharArray()){
            
            if(!Character.isDigit(ch) && !Character.isLetter(ch) && !Character.isWhitespace(ch)){
                
                count ++;
            } else {
                
                RemoveSpecialCharacter = RemoveSpecialCharacter + ch;
                
            }
        }
        
        if(count == 0){
            System.out.println("Thare are no Characters");
        }
        System.out.println(count);
        System.out.println(RemoveSpecialCharacter);
    }
}
