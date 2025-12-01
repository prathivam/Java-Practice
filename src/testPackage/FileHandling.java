package testPackage;

import java.io.File;
import java.io.FileWriter;

public class FileHandling {
    FileHandling(){
        try{
            File myObj = new File("testFile.txt");
            if(myObj.createNewFile()){
                System.out.println("File Created: " + myObj.getName());
            }
            else{
                System.out.println("File exists");
            }

            FileWriter fileWrite = new FileWriter(myObj);
            fileWrite.write("Greetings Human");
            fileWrite.close();
            System.out.println("Written to the File - testFile.txt");
        }
        catch (Exception e){
            System.out.println("An error occurred");
        }
    }
}
