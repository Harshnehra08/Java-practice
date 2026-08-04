package String;
import java.util.HashMap;
public class Char_Frequency_HashMap {
    public static void main(String[] args) {

        String str = "Programming";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }

        System.out.println(map);




    }
}
