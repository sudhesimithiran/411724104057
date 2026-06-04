import java.util.Scanner;

public class AIMD {
    public static void main(String[] args) {
        int cwnd;
        int rounds;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter initial congestion window(cwnd):");
        cwnd = sc.nextInt();
        
        System.out.println("enter no of transmission rounds:");
        rounds = sc.nextInt();

        for(int i = 1; i <= rounds; i++){
            System.out.println(i + "\t" + cwnd);
            System.out.println("Did packet loss occur ? (1 = Yes , 0 = No:");
            int loss = sc.nextInt();


            if(loss ==0){
            cwnd = cwnd + 1;
            }
            else {
                cwnd = cwnd  / 2;
            }
        }
         sc. close();
    }
    
}
