class Shared
{
    int data;
    boolean available = false;

    synchronized void produce(int value)
    {
        if(available)
        {
            try
            {
                wait();
            }
            catch(Exception e){}
        }

        data = value;
        System.out.println("Produced: " + data);

        available = true;
        notify();
    }

    synchronized void consume()
    {
        if(!available)
        {
            try
            {
                wait();
            }
            catch(Exception e){}
        }

        System.out.println("Consumed: " + data);

        available = false;
        notify();
    }
}

class Producer extends Thread
{
    Shared s;

    Producer(Shared s)
    {
        this.s = s;
    }

    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            s.produce(i);
        }
    }
}

class Consumer extends Thread
{
    Shared s;

    Consumer(Shared s)
    {
        this.s = s;
    }

    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            s.consume();
        }
    }
}

public class Test
{
    public static void main(String args[])
    {
        Shared s = new Shared();

        Producer p = new Producer(s);
        Consumer c = new Consumer(s);

        p.start();
        c.start();
    }
}