import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args){
        try {
            File myFile=new File("D:\\Document\\salam");
            //create
            // if(myFile.createNewFile()){
            //     System.out.println("File created: "+myFile.getName());
            // }
            // else{
            //     System.out.println("File allready exists!");
            // }
            //write
                //  FileWriter myWriter=new FileWriter("D:\\Document\\salam.txt");
                //  myWriter.write("Im learning Java file handling right now");
                //  myWriter.close();
                //  System.out.println("File-a elave edildi");
                //read
                // Scanner scn=new Scanner(myFile);
                // while(scn.hasNextLine()){
                //     String metn=scn.nextLine();
                //     System.out.println(metn);
                // }
                // scn.close();
                //delete
                if(myFile.delete()){
                    System.out.println("FIle deleted: "+myFile.getName());
                }
                else{
                    System.out.println("Failed to delete this file");
                }


        } catch (Exception e) {
            System.out.println("Error!");
            e.printStackTrace();
        }
    }
}
