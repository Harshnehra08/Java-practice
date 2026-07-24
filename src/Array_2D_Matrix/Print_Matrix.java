package Array_2D_Matrix;
import java.util.Scanner;
public class Print_Matrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[2][2];

        System.out.println("Enter Matrix Elements:");

        for(int i=0;i<2;i++){

            for(int j=0;j<2;j++){

                arr[i][j]=sc.nextInt();

            }

        }


//        int arr1[][] = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){

                System.out.print(arr[i][j]+" ");

            }

            System.out.println();

        }

    }
}
