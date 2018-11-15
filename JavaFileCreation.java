import java.io.File;
import java.io.IOException;

public class JavaFileCreation {

    public static void main(String[] args) {

        try{
            File file = new File("Desktop:\\newfile.txt");

           boolean fvar = file.createNewFile();
           if(fvar){
               System.out.println("File has been created successfully");
           }else{
               System.out.println("File already exists");
           }
        }catch (IOException e){
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }
    }
}
