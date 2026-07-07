package Array;

public class Count_of_even_odd {
    public static void main(String[] args){
        int arr[] = {1,2, 5,6, 4, 7,8};
        int even = 0;
        int odd = 0;

        for (int i=0; i< arr.length; i++){
            if(arr[i] % 2 == 0){
                even = even + 1;
            }
            else {
                odd++;
            }

        }
        System.out.println("Count of Even Elements = "+ even);
        System.out.println("Count of Odd Elements = "+ odd);
    }
}
