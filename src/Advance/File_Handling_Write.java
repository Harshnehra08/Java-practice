package Advance;
import java.io.*;
import java.io.IOException;

public class File_Handling_Write {
    public static void main(String [] args) throws IOException{
        FileWriter file = new FileWriter("Text.txt");
        file.write("Hello Harsh Nehra");
        file.close();
    }
}
