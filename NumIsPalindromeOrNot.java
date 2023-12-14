public class NumIsPalindromeOrNot {

    public static void main(String[] args) {

        int n=3413;
        int r, sum=0, temp;

        temp = n;

        while(n>0){
            r=n%10;
            sum = sum*10 + r;
            System.out.println(r);
            n/=10;
        }

        if(temp == sum){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Number is not Palindrome");
        }
    }
}
