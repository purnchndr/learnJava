import java.util.Arrays;

public class kthMinAndMaxOfAnArray {
        public static void kthMinMax(int[] arr, int n){
            Arrays.sort(arr);
            int min = arr[n-1];
            int max = arr[arr.length-n];
            System.out.println("Max of array at "+n +" is " +max +"\nMin of the array at "+ n +" is " +min);
        }
        public static void main (String[] args) {
            int[] arr ={1,2,3,4,5,6,7,8,9,10};
            kthMinMax(arr,3);

        }
    }
