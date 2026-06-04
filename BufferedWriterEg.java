import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterEg {
    public static void main(String[] args) {
        try{
            FileWriter file = new FileWriter("output.txt",true);
            BufferedWriter output = new BufferedWriter(file);

            // output.write("This is the first line\n");
            // output.write("This is the second line\n");
            // output.write("This is the third line\n");

            output.write("fourth line \n");
            output.write("fiurth line");
            
            output.newLine();

            output.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Data written");
    }
}