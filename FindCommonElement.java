public class FindCommonElement {

    public static void main(String[] args) {

        String str1[] = {"ABC","DEF","GHI"};
        String str2[] = {"ABC","DEF","MNO"};

        for(int i=0;i<str1.length;i++){
            for(int j=0; j<str2.length;j++){

                if(str1[i] == str2[j]){
                    System.out.println(str1[i]);
//                    break;
                }
            }
        }

    }
}
