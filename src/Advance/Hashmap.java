package Advance;
import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(101,"Harsh");
        map.put(102,"Akash");
        map.put(103,"Mohit");
        map.put(104,"Nishant");
        System.out.println(map);
        System.out.println(map.get(102));
        map.put(105,"HN");
        System.out.println(map);
        map.remove(105);
        System.out.println(map);
        System.out.println(map.containsKey(103));
        System.out.println(map.containsValue("Harsh"));
        for (int key : map.keySet()){
            System.out.print(key + "-" + map.get(key)+ " ");
        }


    }
}
