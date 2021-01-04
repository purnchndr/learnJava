public class reverseAnArrayOfIntegers {
    static  void  reverseArray(int[] arr, int end){
        int temp = 0, start  = 0;
        while (start<end){
            temp= arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static  void  printArray(int[] arr){
        for (int a: arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] Array = {11,22,33,44,55,66,77,99};
        int size = Array.length-1;

        printArray(Array);
        reverseArray(Array,size);
        System.out.println("Below is the reversed array");
        printArray(Array);
    }

}
