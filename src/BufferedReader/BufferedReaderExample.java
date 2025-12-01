package BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderExample {
    public BufferedReaderExample(){
        try(BufferedReader br = new BufferedReader(new FileReader("testFile.txt"))){
            System.out.println("\n Reading File using Buffered Reader");
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(Exception e){
            System.out.println("Error Reading File");
        }
    }
}
