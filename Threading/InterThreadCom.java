 package Threading;
class Demo
{
    synchronized void display()
    {
        try
        {
            System.out.println("Thread waiting...");
            wait();

            System.out.println("Thread resumed");
        }
        catch(Exception e){}
    }

    synchronized void wake()
    {
        notify();
    }
}

public class InterThreadCom
{
    public static void main(String args[]) throws Exception
    {
        Demo d = new Demo();

        Thread t = new Thread(() -> {
            d.display();
        });

        t.start();

        Thread.sleep(2000);

        d.wake();
    }
}