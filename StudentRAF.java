import java.io.RandomAccessFile;
import java.io.IOException;
import java.util.Scanner;

public class StudentRAF {

    public static void main(String[] args) throws IOException {

        RandomAccessFile file = new RandomAccessFile("student.dat","rw");
        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n1.Add Student");
            System.out.println("2.Display Students");
            System.out.println("3.Search Student");
            System.out.println("4.Update Marks");
            System.out.println("5.Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();

                    file.seek(file.length()); // move to end
                    file.writeInt(id);
                    file.writeUTF(name);
                    file.writeInt(marks);

                    System.out.println("Record Added");
                    break;

                case 2:

                    file.seek(0);

                    while(file.getFilePointer() < file.length()) {

                        int sid = file.readInt();
                        String sname = file.readUTF();
                        int smarks = file.readInt();

                        System.out.println(sid+" "+sname+" "+smarks);
                    }

                    break;

                case 3:

                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();

                    file.seek(0);
                    boolean found = false;

                    while(file.getFilePointer() < file.length()) {

                        int sid = file.readInt();
                        String sname = file.readUTF();
                        int smarks = file.readInt();

                        if(sid == searchId) {
                            System.out.println("Found: "+sid+" "+sname+" "+smarks);
                            found = true;
                            break;
                        }
                    }

                    if(!found)
                        System.out.println("Student not found");

                    break;

                case 4:

                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();

                    file.seek(0);

                    while(file.getFilePointer() < file.length()) {

                        long pos = file.getFilePointer();

                        int sid = file.readInt();
                        String sname = file.readUTF();
                        int smarks = file.readInt();

                        if(sid == uid) {

                            System.out.print("Enter new marks: ");
                            int newMarks = sc.nextInt();

                            file.seek(pos + 4 + 2 + sname.length());
                            file.writeInt(newMarks);

                            System.out.println("Marks Updated");
                            break;
                        }
                    }

                    break;

            }

        } while(choice != 5);

        file.close();
    }
}