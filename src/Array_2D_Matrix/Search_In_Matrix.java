package Array_2D_Matrix;

import java.util.Scanner;

public class Search_In_Matrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        for(int i=0; i<arr.length; i++) {

            for(int j=0; j<arr[i].length; j++) {

                if(arr[i][j] == key) {

                    System.out.println("Element Found at Row " + i + " Column " + j);
                    found = true;

                }

            }

        }

        if(found==false) {
            System.out.println("Element Not Found");
        }

    }
}
