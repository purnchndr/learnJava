public class KthMinAndMinElement {
static void kthMaxMin(int[] arr,int k){
    int size = arr.length, temp;
    for(int i =0;i<size-1; i++){
        for(int j =i+1; j< size; j++ ){
            if (arr[i]< arr[j]){
                swap(arr[i],arr[j]);
            }
        }
        if(i== k-1){
            System.out.println("Kth Max Element is "+arr[k-1]);
            break;
        }
    }
    

    
}

    public static void swap(int a,int b){
        int temp = a;
        a =b;
        b= temp;
    }

    public static void main(String[] args) {
    int k = 3;
int[] array = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
kthMaxMin(array ,k);
    }
}
