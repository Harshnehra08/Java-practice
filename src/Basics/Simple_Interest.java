package Basics;

public class Simple_Interest {
    public static void main(String[] args){
        double price = 120000;
        double rate = 2;
        double time = 3;

        double interest = (price * rate * time)/ 100;

        System.out.println("Simple Interest = "+ interest);

        double Total_amount = price + interest;

        System.out.println("Total Amount = " + Total_amount);
    }
}
