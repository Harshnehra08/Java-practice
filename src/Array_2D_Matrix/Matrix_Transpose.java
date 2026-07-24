package Array_2D_Matrix;

public class Matrix_Transpose {

    public static void main(String[] args) {

        int arr[][] = {
                {1,2,3},
                {4,5,6}
        };

        System.out.println("Transpose Matrix:");

        for(int i=0;i<arr[0].length;i++){

            for(int j=0;j<arr.length;j++){

                System.out.print(arr[j][i] + " ");

            }

            System.out.println();

        }

    }

}
