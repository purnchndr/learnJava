public class minAndMaxOfAnArray {
    static void minMax(int[] arr){
        int size = arr.length-1 ,min = arr[0], max =arr[0];
        for(int i = 0; i<size;i++ ){
            if(min> arr[i]){
                min = arr[i];
            }
            else if(max< arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Minimum number in the array is "+min+"\nMaximum number in the array is " + max);

    }

    public static void main(String[] args) {
        int[] arr = {222222,0,12,21,56,-200,556,69955,-1,0,555,4,556,1};
        minMax(arr);
    }
}