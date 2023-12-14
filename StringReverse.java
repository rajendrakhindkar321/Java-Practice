public class StringReverse {

    public static void main(String[] args) {

        String str = "Hello";
        String rstr="";

        for(char ch : str.toCharArray()){

            rstr = ch + rstr;
        }
        System.out.println(rstr);

//        for(int i=0;i<str.length();i++){
//            ch = str.charAt(i);
//            rstr = ch + rstr;
//        }
//
//        System.out.println(rstr);
    }
}
