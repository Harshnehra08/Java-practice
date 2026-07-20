package Array;

public class Selection_Sort {
    public static void printArray(int arr[]) {
        System.out.print("Sorted Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int arr[] = {32,65,22,11,10};
        for(int i = 0; i<arr.length; i++){
            int min = i;
            for (int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min =j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }

}
