package Advance;
import java.io.*;
import java.io.IOException;
public class File_Handling_Delete {
    public static void main(String[] args)  throws IOException{
        File f = new File("Stu.txt");
        if (f.createNewFile()){
            System.out.println("File Created");
        }
        else {
            System.out.println("File Already Exist");
        }
        if (f.delete()){
            System.out.println("File Deleted");
        }
        else {
            System.out.println("File Not Deleted");
        }
    }
}
