package Advance.Java8;
interface MyInterface {
        void show();
}

public class Lambda_Expression {
        public static void main(String[] args) {

            MyInterface obj = () -> {
                System.out.println("Hello");
            };

            obj.show();
        }

}

