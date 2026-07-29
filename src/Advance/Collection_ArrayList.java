package Advance;
import java.util.ArrayList;
public class Collection_ArrayList {
    public static void main(String[] args){
       ArrayList<String> list = new ArrayList<>();
       list.add("Java");
       list.add("Python");
       list.add("C++");
       list.add("C");
       System.out.println(list);
       System.out.println(list.get(1));
       list.set(0,"Java8");
       System.out.println(list);
       list.remove(3);
       System.out.println(list);
       System.out.println(list.size());
       for (String s:list){
           System.out.print(s + " ");
       }
    }
}
