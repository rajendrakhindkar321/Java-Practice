public class IsPalindromeOrNot {

    public static void main(String[] args) {

        String str = "Nitinl";
        String str1 = str.toLowerCase();

        StringBuilder sb = new StringBuilder(str1);
        //   String rstr = String.valueOf(sb.reverse());
        sb.reverse();
        String rstr = sb.toString();

        if(rstr.equals(str1)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome");
        }

    }
}
