package Basics;

public class Multiplication_Table {
    public static void main(String[] args){
        int n = 5;

        for (int i=1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }


        int ans = 0;
        for (int i =1; i<=10; i++){
            ans = n * i;
            System.out.println(n + " * " + i + " = " + ans);
        }
    }
}
