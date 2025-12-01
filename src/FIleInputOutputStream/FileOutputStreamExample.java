package FIleInputOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

     public FileOutputStreamExample() {
//    Output Text into a File using file output stream
        String sampleText = "Fatality, subzero wins!";

        try(FileOutputStream output = new FileOutputStream("output_stream_example2.txt")){
            output.write(sampleText.getBytes());
            System.out.println("\n Written data to the file using output stream");
        }
        catch(IOException e){
            System.out.println("Unable to write to File: " + e.getMessage());
        }
    }
}
