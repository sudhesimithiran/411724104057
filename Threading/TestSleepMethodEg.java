 package Threading;

// class MyThread1 extends Thread
// {
//     public void run()
//     {
//         for(int i=1;i<=5;i++)
//         {
//             System.out.println(Thread.currentThread().getName());
//             try{Thread.sleep(500);}catch(Exception e){}
//         }
//     }
// }
// public class TestSleepMethodEg extends Thread {
//     public static void main(String[] args) {
//         MyThread1 t1=new MyThread1();
//         MyThread1 t2=new MyThread1();

//         t1.start();
//         t2.start();

//         System.out.println("in main thread....");
//     }
// }
class TrafficSignal implements Runnable {
    public void run() {
        try {
            System.out.println("Red");
            Thread.sleep(1000);

            System.out.println("Yellow");
            Thread.sleep(1000);

            System.out.println("Green");
            Thread.sleep(1000);
        } 
        catch (Exception e) {
            
        }
    }

    public static void main(String[] args) {
        
        
        Thread t1 = new Thread(new TrafficSignal());
        t1.start();
    }
}