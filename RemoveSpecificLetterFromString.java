import java.sql.SQLOutput;

public class RemoveSpecificLetterFromString {

    public static void main(String[] args) {

        String str = "CloudTech";
        char ch = 'C';

        removechar(str, ch);

//        for(char ch: str.toCharArray()){
//            if(!(ch == 'c' || ch == 'C')) str1 = str1 + ch;
//        }



        }

    public static void removechar(String str, char c){

        int n = str.length();

        String finalstr = "";

        for(int i=0;i<n;i++){
            if(str.charAt(i) !=c){
                finalstr = finalstr + str.charAt(i);
            }
      }
        System.out.println(finalstr);
    }
}
