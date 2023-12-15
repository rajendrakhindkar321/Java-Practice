package ArrayPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SecondSmallest {

    public static void SecondSmallestNum(int[] arr) {
        int n = arr.length;
        int secondsmallest = Arrays.stream(arr).distinct().sorted().skip(n - 2).findFirst().orElseThrow(() -> new IllegalArgumentException("Arrays don't have a second smallest element"));
        System.out.println("Second Smallest Number is : " + secondsmallest);
        System.out.println("===========================================================================");
        for (int a : arr) {
            System.out.print(a + " ");
        }

      }

        public static void fetchCommonValue(int[] array1, int[] array2){
            System.out.println();
            List<Integer> commonElements = Arrays.stream(array1).filter(number -> Arrays.stream(array2).anyMatch(arr2Number -> arr2Number == number)).boxed().collect(Collectors.toList());
            System.out.println("===========================================================================");
            System.out.println("Common Elements are : " + commonElements);
            System.out.println("===========================================================================");

    }

    public static void reverseGivenArrayInPlace(int[] arr){
        System.out.println("Original Array" + Arrays.toString(arr));
        IntStream.range(0, arr.length/2).forEach( i -> {
            int temp = arr[i];
            arr[i] = arr[arr.length -i-1];
            arr[arr.length-i-1] = temp;
        });
        System.out.println("Reversed Array" + Arrays.toString(arr));
    }
    public static void main(String[] args) {

        int arr[] = {5,8,1,3,2,1};

        SecondSmallestNum(arr);

        // To find common elements

        int arr1[] = {1,2,3,4,5};
        int arr2[] = {7,4,8,1,5};

        fetchCommonValue(arr1, arr2);

        // To Reverse an array

        int[] array = {5,4,3,2,1};

        reverseGivenArrayInPlace(array);
    }

}
