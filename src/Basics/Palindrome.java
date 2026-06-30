package Basics;

public class Palindrome {
    public static void main(String[] args){
        int num = 11211;
        int temp = num;
        int rev = 0;
        while (num > 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        if(temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
