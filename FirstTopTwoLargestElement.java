public class FirstTopTwoLargestElement {

    public static void main(String[] args) {

        int[] inputNumberArray = {10,5,8,99,45,32,87,898};

        int firstLargest = 0;
        int secondLargest = 0;

        for(int i=0;i<inputNumberArray.length;i++){

            if(firstLargest < inputNumberArray[i]){

                secondLargest = firstLargest;
                firstLargest = inputNumberArray[i];
            } else if(secondLargest < inputNumberArray[i]){
                secondLargest = inputNumberArray[i];
            }
        }
    }
}
