package Advance.Java8;
import java.util.*;
import java.util.stream.*;

public class Method_Reference {

        public static void main(String[] args) {

            List<String> names =
                    Arrays.asList("harsh", "aman", "rahul");

            names.stream()
                    // String::toUpperCase  and   System.out::println
                    .map(String::toUpperCase)
                    .forEach(System.out::println);
        }

}
