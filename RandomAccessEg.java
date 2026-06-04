import java.io.RandomAccessFile;

public class RandomAccessEg {
    public static void main(String[] args) {
        // try {
        //     RandomAccessFile raf=new RandomAccessFile("data2.txt", "rw");
        //     raf.writeInt(101);
        //     raf.writeUTF("Rose");
        //     raf.close();
        //     System.out.println("Data written successfully!!");
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        // try {
        //     RandomAccessFile raf=new RandomAccessFile("data2.txt", "r");
        //     int id=raf.readInt();
        //     String name=raf.readUTF();
        //     System.out.println("ID: "+id);
        //     System.out.println("Name: "+name);
        //     raf.close();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }

        try {
            RandomAccessFile raf=new RandomAccessFile("data2.tax", "rw");
            raf.writeInt(100);
            raf.writeInt(200);
            raf.writeInt(300);
            System.out.println(raf.getFilePointer());
            raf.seek(4);//Move to second integer
            int num=raf.readInt();
            System.out.println("Second number: "+num);
            raf.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
