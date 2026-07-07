package Array;

public class Find_minimum {
    public static void main(String[] args){
        int arr[] = {10,20, 90, 40, 50};
        int min = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.print("Elements of array: ");
        for (int i=0;i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println('\n'+"Minimum Element of array = "+ min);
    }
}
