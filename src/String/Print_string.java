package String;

public class Print_string {
    public static void main(String [] args){
       String s = "Java Programming";
       for (int i=0; i < s.length(); i++){
           System.out.print(s.charAt(i)+ " ");
       }
        System.out.print('\n'+ s.substring(1,9)+ " ");
        System.out.print('\n'+ s.trim()+ " ");
        System.out.print('\n'+ s.replace("Pro" , "XYZ")+ " "+ '\n');
        String arr[] = s.split("a");
        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


