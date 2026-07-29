package Advance;
import java.io.*;
import java.io.IOException;

public class File_Handling_Read {
    public static void main(String [] args) throws IOException{
        FileReader file = new FileReader("Text.txt");
        int ch;
        while ((ch = file.read()) != -1){
            System.out.print((char)ch);

        }
        file.close();

    }
}