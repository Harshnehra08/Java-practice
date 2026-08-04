package String;

public class Count_Character_Occurrence {
    public static void main(String[] args) {

        String str = "Programming";

        char target = 'g';

        int count = 0;

        for (char ch : str.toCharArray()) {

            if (ch == target)

                count++;
        }

        System.out.println(count);
    }
}
