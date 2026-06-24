package Basics;

public class Swap_of_two_no {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("Number After Swap, a = " + a + "\nNumber After Swap, b = " + b);

    }
}
