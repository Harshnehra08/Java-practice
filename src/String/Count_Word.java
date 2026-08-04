package String;

public class Count_Word {
    public static void main(String[] args) {

        String str = "Java Python SQL";

        String[] words = str.trim().split("\\s+");

        System.out.println(words.length);
    }
}
