package Array;

public class Find_maximum {
    public static void main(){
        int arr[] = {10,20, 90, 40, 50};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print("Elements of array: ");
        for (int i=0;i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println('\n'+"Maximum Element of array = "+ max);
    }
}
