import java.util.Scanner;

public class ScannerBasic {
    public static void main(String[] args){
        int rollno;
      float per;
       // char gender;
        String name;
        

        Scanner sc = new Scanner(System.in);


        System.out.println("enter rollno:");
        rollno = sc.nextInt();
         System.out.println("enetr per:");
        // System.out.println(gender);
        System.out.println("enter name:");
        sc.nextLine();
        name = sc.nextLine ();
        System.out.println("enter per:");
        sc.nextFloat();

        System.out.println(rollno);
        System.out.println(name);
        System.out.println(per);
        sc.close();
    }
    
}
