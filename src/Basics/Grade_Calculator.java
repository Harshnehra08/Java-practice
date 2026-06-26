package Basics;

public class Grade_Calculator {
    public static void main(String[] args){
        int marks = 89;

        switch (marks / 10) {
            case 10:
            case 9:
                System.out.println("Grade A");
                break;

            case 8:
                System.out.println("Grade B");
                break;

            case 7:
                System.out.println("Grade C");
                break;

            case 6:
                System.out.println("Grade D");
                break;

            default:
                System.out.println("Fail");
        }

        //By If Else
//        if (marks >= 90)
//            System.out.println("A");
//        else if (marks >= 80) 
//            System.out.println("B");
//        else if (marks >= 70)
//            System.out.println("C");
//        else
//            System.out.println("Fail");


    }
}
