package String;
import java.util.HashMap;
public class Most_Freq_Character {
    public static void main(String[] args) {

        String str = "Programming";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char result = ' ';
        int max = 0;

        for (char ch : map.keySet()) {

            if (map.get(ch) > max) {

                max = map.get(ch);
                result = ch;
            }
        }

        System.out.println(result + " = " + max);
    }

}
