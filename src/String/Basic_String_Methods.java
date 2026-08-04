package String;

public class Basic_String_Methods {
    public static void main(String[] args) {

        String str = "Programming";

        System.out.println(str.length());

        System.out.println(str.charAt(0));

        System.out.println(str.substring(3));

        System.out.println(str.toUpperCase());

        System.out.println(str.toLowerCase());

        System.out.println(str.contains("gram"));

        System.out.println(str.startsWith("Pro"));

        System.out.println(str.endsWith("ing"));

        System.out.println(str.indexOf('g'));

        System.out.println(str.replace("Pro", "Java"));

//  String to Char_ array
        String str1 = "Java";

        char[] arr = str1.toCharArray();

        for (char ch : arr)

            System.out.print(ch);
    }
}
