import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class PrintStreamEg {
    public static void main(String[] args) {
        // try {
        //     FileInputStream fin = new FileInputStream("student.txt");
        //     Scanner sc= new Scanner(fin);
        //     int age=sc.nextInt();
        //     System.out.println(age);
        //     sc.close();
        //     fin.close();
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }

   

        try {
            FileInputStream fin = new FileInputStream("student.txt");

            Scanner sc = new Scanner(fin);

            int age = sc.nextInt();
            System.out.println("Age: " + age);

            String name = sc.next();
            System.out.println("Name: " + name);

            double cgpa = sc.nextDouble();
            System.out.println("CGPA: " + cgpa);

            sc.close();
            fin.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
    