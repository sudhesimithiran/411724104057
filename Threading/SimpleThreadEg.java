package Threading;
class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }
    public void run(){
        System.out.println("Thread is running...");
        System.out.println("Thread name: "+Thread.currentThread().getName());
    }
}
public class SimpleThreadEg{
    public static void main(String[] args) {
        System.out.println("Main thread... started.."+Thread.currentThread());
        MyThread t1=new MyThread("java-thread-1");
        t1.start();//starts the thread and executes the run method
        System.out.println("main thread running..."+Thread.currentThread());
    }
}