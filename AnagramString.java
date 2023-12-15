import java.util.Arrays;

public class AnagramString {

    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "bcad";
        String str3 = "aeed";
        String str4 = "etad";

        System.out.println(isAnagram(str1,str2));
        System.out.println(isAnagram(str3,str4));

    }

    public static boolean isAnagram(String str1 , String str2){

        boolean value = false;
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            value = true;
        }

        return value;
    }


}
