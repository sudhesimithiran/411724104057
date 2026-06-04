import java.util.Scanner;
public class TCPSlowStart {
    public static void main(String[] args) {
        int cwnd=1;//Congestion window
        int ssthresh;//Slow start threshold
        int rtt=1;//Round Trip Time counter
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Slow Start Threshold(ssthresh):");
        ssthresh=sc.nextInt();
        System.out.println("\nRRT\tcwnd");
        //Slow Start Process
        while (cwnd<ssthresh) {
            System.out.println(rtt+"\t"+cwnd);
            cwnd=cwnd*2;//Exponential growth
            rtt++;
        }
        System.out.println(rtt+"\t"+cwnd);
        System.out.println("\nSlow Start phase completed.");
        sc.close();
    }
}
