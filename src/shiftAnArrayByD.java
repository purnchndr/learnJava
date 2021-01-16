import java.util.Arrays;
import java.util.Scanner;

public class shiftAnArrayByD {
    public static void rotateByD(int[] arr,int d){
        for (int i =0; i < d; i++){
            rotateArrayByOne( arr);
        }
    }
    public static void  rotateArrayByOne(int[] arr){
        int n = arr.length,temp;
        for (int i =0; i< n-1; i++){
            temp = arr[i+1];
            arr[i+1] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int d = 2;
        Scanner input = new Scanner(System.in);Scanner in2 = new Scanner(System.in);

        System.out.println("Given array is "+ Arrays.toString(arr));
        System.out.println("Enter D");
        d = input.nextInt();
        System.out.println("Custom Input");
        String c= in2.nextLine();
        rotateByD(arr,d);
        System.out.println(c+" "+Arrays.toString(arr));
    }
}
