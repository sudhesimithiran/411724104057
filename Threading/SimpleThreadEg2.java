package Threading;

class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Child Thread is running...");
        System.out.println(Thread.currentThread());
    }
}
public class SimpleThreadEg2 {
    public static void main(String[] args) {
        // MyRunnable runnable = new MyRunnable();
        // Thread t1=new Thread(runnable);
        // t1.start();
        

        Thread t1 = new Thread(new MyRunnable());
        t1.start();

    }
}