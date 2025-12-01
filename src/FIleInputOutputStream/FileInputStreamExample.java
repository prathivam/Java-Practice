package FIleInputOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamExample {
    public FileInputStreamExample(){
//        Reading From a txt file
        System.out.println("\nReading File using FileInputStream");
        try(FileInputStream input = new FileInputStream("testFile.txt")){
            int i;
            while((i = input.read()) != -1){
                System.out.print((char) i);
            }
        }
        catch(Exception e){
                System.out.println("Error Reading File");
        }

//        Reading From an image file
        System.out.println("\n Reading Image using FIleInputStream");
        try(
            FileInputStream input = new FileInputStream("download.jpg");
            FileOutputStream output = new FileOutputStream("output_image.jpg")
        ){
            int i;
            while((i = input.read()) != -1){
                output.write(i);
            }
            System.out.println("File Successfully copied");
        }
        catch (Exception e){
            System.out.println("Something went wrong while copying the image file");
        }
    }
}
