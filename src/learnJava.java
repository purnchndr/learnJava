import java.util.*;

class leanJava{


    public static void main(String[] args) {
        Map<Integer,Object> list = new HashMap<>();
        list.put(1,"purna");
        list.put(2,55);
        list.put(3,'h');
        list.put(1 , "Chand");
        for (Map.Entry<Integer,Object> m: list.entrySet()) {
            System.out.println("The Key is : "+ m.getKey()+" And the value is : "+ m.getValue());
        }
    }
}