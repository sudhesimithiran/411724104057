import java.util.Scanner;
public class Gbsum {
    //2gb per day 1gb=1000mb per hr=200mb will be deducted read no.of hrs and tell the remaining mb
    public static void main(String[] args) {
        int totalMb = 2000; // 2GB = 2000MB
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of hours used: ");
        int hoursUsed = sc.nextInt();
        int mbDeductedPerHour = 200;
        
        int totalDeducted = hoursUsed * mbDeductedPerHour;
        int remainingMb = totalMb - totalDeducted;
        
        System.out.println("Remaining MB: " + remainingMb);
        sc.close();
    }
}