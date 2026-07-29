package Advance;
import java.util.HashSet;
public class Hashset {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java");
        System.out.println(set);
        System.out.println(set.contains("Java"));

        int arr[]={1,1,2,2,3,4};
        HashSet<Integer> ar = new HashSet<>();
        for (int i=0; i<arr.length; i++){
            ar.add(arr[i]);
        }
        System.out.println(ar);
        System.out.println(set.size());

    }
}
