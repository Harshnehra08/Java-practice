package Advance;
import java.io.*;
import java.io.IOException;

public class File_Handling_Buffer_read {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("Text.txt"));
        String line;
        while ((line = br.readLine()) != null){
            System.out.print(line);

        }
        br.close();

    }
}