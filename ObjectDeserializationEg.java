import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectDeserializationEg {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("student.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student1 s1 = (Student1) ois.readObject();

            System.out.println("ID: " + s1.id);
            System.out.println("Name: " + s1.name);
            System.out.println("Marks: " + s1.marks);

            ois.close();
            fis.close();

        } catch (Exception e) {
          e.printStackTrace();
        }
    }
}