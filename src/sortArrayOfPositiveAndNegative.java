public class sortArrayOfPositiveAndNegative {
    static  void moveNeg(int [] arr) {
        int[] arr2 = new int[arr.length];
        arr2 = arr;
        int i = 0, temp;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < 0) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }


    }
    static  void print(int[] arr){
        for(int i : arr){
            System.out.print(i +" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {12, -11, -13, 5,-9,5,-7,-6,-2,1,2,3,-5};
        print(arr);
        moveNeg(arr);
        print(arr);
    }
}
