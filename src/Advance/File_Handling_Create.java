package Advance;
import java.io.*;
import java.io.IOException;

public class File_Handling_Create {
    public static void main(String [] args) throws IOException{
        File file = new File("Text.txt");
        if(file.createNewFile()){
            System.out.println("File Created");
        }
        else {
            System.out.println("File Already exist");
        }
    }
}
