package Advance;

public class Exception_Handling {
    public static void main(String[] args){
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        }
        catch (ArithmeticException e){
            System.out.println("Cann't Divide");
        }
        try{
            int arr[]={1,2};
            System.out.println(arr[5]);
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }
        finally {
            System.out.println("Run every time");
        }
    }
}
