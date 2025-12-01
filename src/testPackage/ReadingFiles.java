package testPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles{
    ReadingFiles(){
        System.out.println("reading From testFile.txt file");
        File myFile = new File("testFile.txt");
        try(Scanner scannerObj = new Scanner(myFile)){
            while(scannerObj.hasNextLine()){
                String data = scannerObj.nextLine();
                System.out.println(data);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("An Error Occurred");
        }
    }
}