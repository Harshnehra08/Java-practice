package Advance.Java8;
import java.util.*;
import java.util.stream.*;

public class Stream_API {

        public static void main(String[] args) {

            List<Integer> numbers =
                    Arrays.asList(10, 20, 30, 40);

            List<Integer> result =
                    numbers.stream()
                            .filter(n -> n > 20)
                            .collect(Collectors.toList());

            System.out.println(result);


                List<Integer> numbers1 =
                        Arrays.asList(10, 15, 20, 25, 30, 35);

                numbers1.stream()
                        .filter(n -> n % 2 == 0)
                        .map(n -> n * 2)
                        .sorted()
                        .forEach(System.out::println);

        }

}
