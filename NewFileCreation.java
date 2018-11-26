import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class NewFileCreation {

    public static void main(String[] args) throws FileNotFoundException {

        FileOutputStream fos = new FileOutputStream("myfile.txt");

        PrintWriter pw = new PrintWriter(fos);

        pw.println("Hi there!");
        pw.println("My name is Evelin!");
        pw.println("Nice to meet you!");
        pw.close();

    }




}
