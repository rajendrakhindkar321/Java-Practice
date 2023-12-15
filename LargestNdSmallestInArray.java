public class LargestNdSmallestInArray {
    public static void main(String[] args) {

        int[] array = {1008,10,14,54,32,67,54,89,675,989};

        int maxNumber = array[0];
        int minNumber = array[0];

        for(int i=0;i<array.length;i++){
            if(maxNumber < array[i]){
                maxNumber = array[i];
            }else if(minNumber > array[i]){
                minNumber = array[i];
            }

        }
        System.out.println("Largest Number is : " + maxNumber + " Smallest Number is " + minNumber);

    }
}
