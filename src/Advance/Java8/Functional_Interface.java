package Advance.Java8;
@FunctionalInterface
interface Calculator {

    int add(int a, int b);

}
public class Functional_Interface {
        public static void main(String[] args) {

            Calculator c = (a, b) -> a + b;

            System.out.println(c.add(10, 20));
        }

}
