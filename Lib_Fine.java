import java.util.Scanner;
public class Lib_Fine {
    public static void main(String[] args) {
        int dayslate;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of days late:");
        dayslate=sc.nextInt();
        int fine=((dayslate/7)*10)+((dayslate%7)*2);
        System.out.println("Fine amount "+fine);
        sc.close();
    }
}