package Array_2D_Matrix;

public class Largest_Element_Matrix {

    public static void main(String[] args) {

        int arr[][] = {
                {2,8},
                {5,10}
        };

        int max=arr[0][0];

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){

                if(arr[i][j]>max){

                    max=arr[i][j];

                }

            }

        }

        System.out.println("Largest = "+max);

    }

}
