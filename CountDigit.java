public class CountDigit {

    public static void main(String[] args) {

        int i=9129345;
        int count=0;

        while(i>0){
            count++;
            i = i/10;
            System.out.println(i);
        }

        System.out.println(count);
    }
}
