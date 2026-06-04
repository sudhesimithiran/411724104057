import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyEg {
    public static void main(String[] args) {
        try {
            String filename = "C:\\Folder1\\modi.jpg";
            FileInputStream fin = new FileInputStream(filename);

            String outfile = "C:\\Folder2\\modi.jpg";
            FileOutputStream fout = new FileOutputStream(outfile);

            byte[] buffer = new byte[1024];
            int bytesread;

            while ((bytesread = fin.read(buffer)) != -1) {
                fout.write(buffer, 0, bytesread);
            }

            System.out.println("Image copied successfully!!");

            fin.close();
            fout.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
