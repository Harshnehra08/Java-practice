package String;

public class Reverse_only_Vowels {
    public static void main(String[] args) {

        String str = "Programming";

        char[] arr = str.toCharArray();

        int left = 0, right = arr.length - 1;

        while (left < right) {

            while (left < right && "aeiouAEIOU".indexOf(arr[left]) == -1)
                left++;

            while (left < right && "aeiouAEIOU".indexOf(arr[right]) == -1)
                right--;

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(new String(arr));
    }
}
