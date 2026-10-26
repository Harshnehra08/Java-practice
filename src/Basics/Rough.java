package Basics;

import java.util.Scanner;

public class Rough {
    public static void printHello (){
        System.out.println("Hello World");
    }
    public static void printName (String name){
        System.out.println(name);
    }
    public static void main(String[] args){
        printHello();
        printHello();
        printHello();
        Scanner sc = new Scanner(System.in);
        String Name = sc.next();
        printName(Name);
    }
}
