package String;

public class StringBuilder_Method {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");
        sb.insert(4, " Language");
        sb.delete(4, 13);
        sb.replace(0, 4, "Python");
        sb.reverse();

        System.out.println(sb);
    }
}
