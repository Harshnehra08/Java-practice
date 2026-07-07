package Array;

import java.util.Scanner;

public class Reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int size = sc.nextInt();
        System.out.print("Enter the Elements of array = ");
        int arr[] = new int[size];

        for (int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Elements of array = ");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.print('\n'+"Reverse the array = ");
        for (int i= arr.length-1; i >= 0; i--){
            System.out.print(arr[i]+ " ");
        }


    }
}
