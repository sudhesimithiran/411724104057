import java.util.Random;
import java.util.Scanner;

class Stop_and_wait
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();

        System.out.println("enter no: of frames to read :");

        int n=sc.nextInt();

        int frame=1;

        while(frame <=n)
        {
            System.out.println("\n Sender sending frames :"+frame);
            boolean ackreceived=rand.nextBoolean();

            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            if(ackreceived)
            {
                System.out.println("Receiver : ACK received for frames :"+frame);
                frame++;
            }
            else
            {
                System.out.println("Receiver : ACK lost for frames :"+frame);
                System.out.println("Sender : Retransmitting frames :"+frame);
            }
        }
        System.out.println("\n All frames sent successfully...!");
        sc.close();
    }
}