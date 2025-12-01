package BufferedReader;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterExample {
    public BufferedWriterExample(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("bufferedWriterExample.txt"))){
            bw.write("\n Hello World , from buffered Writer ");
            bw.newLine();
            bw.write("\n Hello World again, from buffered Writer 2");
            System.out.println("\n Written to the File using Buffered Reader");
        }
        catch (Exception e){
            System.out.println("Error Writing to File");
        }

    }
}
