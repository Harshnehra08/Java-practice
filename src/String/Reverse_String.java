package String;

public class Reverse_String {
        public static void main(String[] args) {

            String str = "Programming";

            for (int i = str.length() - 1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }

            StringBuilder sb = new StringBuilder(str);

            System.out.println(sb.reverse());

        }
}
