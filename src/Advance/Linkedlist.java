package Advance;
import java.util.LinkedList;
public class Linkedlist {
        public static void main(String[] args) {

            LinkedList<String> list = new LinkedList<>();

            list.add("Java");
            list.add("Python");
            list.add("C++");
            list.add(1,"Spring Boot");
            list.addFirst("Java8");
            list.addLast("SQL");

            System.out.println(list);
            System.out.println(list.get(3));
            System.out.println(list.getFirst() + " "+ list.getLast());
            list.set(1,"Java Script");
            System.out.println(list);
            list.remove(1); // or  list.remove("Java Script"); or list.removeFirst();  or list.removeLast();
            System.out.println(list);
            System.out.println(list.size());
            System.out.println(list.contains("Java"));
            for (int i=0; i<list.size(); i++){
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
            for (String lang : list){
                System.out.print(lang + " ");
            }

        }


}
