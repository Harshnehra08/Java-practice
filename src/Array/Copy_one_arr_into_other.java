package Array;

public class Copy_one_arr_into_other {
    public static void main(String[] args){
        int arr1[] = {10, 20, 30, 40, 50};
        System.out.print("Elements of array = ");
        for (int i = 0; i< arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        int arr2[] = new int[arr1.length];
        for (int i=0; i< arr1.length; i++){
            arr2[i] = arr1[i];
        }

        System.out.print('\n'+"Copyed array = ");
        for(int i=0; i< arr1.length; i++){
            System.out.print(arr2[i]+" ");
        }

    }
}
