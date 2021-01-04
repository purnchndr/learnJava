public class sort012 {

   public  static  void sort012Array(int[] arr){
       int low = 0, mid=0, high = arr.length-1, temp;
       while (mid <= high){
           switch (arr[mid]){
               case 0:{
                   temp = arr[low];
                   arr[low] = arr[mid];
                   arr [mid] =temp;
                   low++;
                   mid++;
                   break;
               }
               case 1:{
                   mid++;
                   break;
               }
               case 2:{
                   temp= arr[mid];
                   arr[mid] = arr[high];
                   arr[high]= temp;
                   high--;
                   break;
               }
           }
       }
       for(int a : arr){
           System.out.print(a+" ");
       }
   }
    public static void main(String[] args) {
       int[] arry = {1,2,0,1,0,0,2,2,1,0,0,1,1};
       sort012Array(arry);

    }
}
