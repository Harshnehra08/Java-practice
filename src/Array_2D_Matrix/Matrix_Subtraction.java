package Array_2D_Matrix;

public class Matrix_Subtraction {
        public static void main(String[] args) {

            int a[][] = {
                    {5,8},
                    {7,9}
            };

            int b[][] = {
                    {2,4},
                    {1,3}
            };

            int c[][] = new int[2][2];

            for(int i=0; i<2; i++) {

                for(int j=0; j<2; j++) {

                    c[i][j] = a[i][j] - b[i][j];

                }
            }

            System.out.println("Subtraction Matrix:");

            for(int i=0; i<2; i++) {

                for(int j=0; j<2; j++) {

                    System.out.print(c[i][j] + " ");

                }

                System.out.println();
            }

        }

}
