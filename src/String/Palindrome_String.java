package String;

public class Palindrome_String {
    public static void main(String[] args) {

        String str = "MADAM";

        int left = 0;
        int right = str.length() - 1;

        boolean palindrome = true;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                palindrome = false;
                break;
            }

            left++;
            right--;
        }

        System.out.println(palindrome ? "Palindrome" : "Not Palindrome");
    }
}
