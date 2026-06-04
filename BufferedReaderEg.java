import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderEg {
    public static void main(String[] args) {
        // String data="This is the data in the output file\nFirst Line\nSecond Line\nThird Line";
        // try {
        //     FileWriter file=new FileWriter("output.txt");
        //     BufferedWriter output=new BufferedWriter(file);
        //     output.write(data);
        //     output.close();
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        // System.out.println("data written...");

        try {
            //Create a file reader
            FileReader file=new FileReader("output.txt");
            //Create a BufferReader
            BufferedReader input=new BufferedReader(file);
            String str = input.readLine();
            while (str != null) {
                System.out.println(str);
                str = input.readLine();
                
            }
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}