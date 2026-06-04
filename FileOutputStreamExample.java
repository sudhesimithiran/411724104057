import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        try{
             FileOutputStream fout=new FileOutputStream("data5.txt");
            // char ch = 'a';
            // byte b = (byte)ch;
            // fout.write(b);
            // fout.write((byte)'b');
            // fout.write((byte)'c');
            // fout.close();

            String s = "Welcome to IOStreams.";
            byte b[]=s.getBytes();
            fout.write(b);
            fout.close();


            System.out.println("success...");
        }catch(Exception e){System.out.println(e);}
    }
    
}
