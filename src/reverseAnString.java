public class reverseAnString {
    static  String reverseString(String str){
        int size  = str.length(), start=0, end = size-1;
        char temp;
        char[] ch  = new char[size];
        for (int i =0 ; i< size; i++){
            ch[i] = str.charAt(i);
        }
        while (start< end){
            temp = ch[start];
            ch[start]= ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        str = new String(ch);
        return str;
    }


    public static void main(String[] args) {

String name= "Purnachandra Pratap";
System.out.println(name);
System.out.println(reverseString(name));


    }
}
