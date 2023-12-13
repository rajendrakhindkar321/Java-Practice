package master_lambda;

public class CountSpecialCharacter {

    public static void main(String[] args) {

        String str = "CloudTech#$%9870";

        int countLetter = 0;
        int countSpecialCharacter = 0;
        int countDigits = 0;


        StringBuilder buildLetter = new StringBuilder();
        StringBuilder buildSpecialCharacter = new StringBuilder();
        StringBuilder buildDigits = new StringBuilder();



        for(char ch : str.toCharArray()) {
            if(Character.isLetter(ch)){
                buildLetter.append(ch);
                countLetter++;
            }else if(Character.isDigit(ch)){
                buildDigits.append(ch);
                countDigits++;

            } else{
                buildSpecialCharacter.append(ch);
                countSpecialCharacter++;
            }

        }

        System.out.println("Total Characters are " +countLetter);
        System.out.println(buildLetter);
        System.out.println("Total Digits are " + countDigits);
        System.out.println(buildDigits);
        System.out.println("Total Special Characters are " + countSpecialCharacter);
        System.out.println(buildSpecialCharacter);


    }
}
