import java.io.*;

class Student1 implements Serializable {

    private static final long serialVersionUID = 1L;

    int id;
    String name;
    transient int marks;

    Student1(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

public class ObjectSerializationEg {

    public static void main(String[] args) {

        try {

            // Serialization
            Student1 s1 = new Student1(101, "Rose", 85);

            FileOutputStream fos = new FileOutputStream("student.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);

            oos.close();
            fos.close();

            System.out.println("Object written successfully!");

            // Deserialization
            FileInputStream fis = new FileInputStream("student.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student1 s = (Student1) ois.readObject();

            System.out.println("ID: " + s.id);
            System.out.println("Name: " + s.name);
            System.out.println("Marks: " + s.marks);

            ois.close();
            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}