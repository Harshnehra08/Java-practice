package Array;

import java.util.Scanner;
public class Linear_Search {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the Elements of array: ");
        for (int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Elements of array: ");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

        System.out.print('\n'+"Enter the Search Element: ");
        int search = sc.nextInt();
        char temp = 'a';
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Element found at index = " + i);
                temp = 'b';
                break;
            }
        }
        if (temp == 'a') {
            System.out.println("Element Not Found");
        }
    }
}

