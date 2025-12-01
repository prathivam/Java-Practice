package testPackage;

import java.io.File;

public class DeletingFiles {
    DeletingFiles(){
        File myFile = new File("temp.txt");
        if(myFile.delete()){
            System.out.println("Deleted the Folder: " + myFile.getName());
        }
        else{
            System.out.println("Error Deleting the File");
        }
    }

}
