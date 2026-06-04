package Threading;

public class LambdaThreadEg {
    
    public static void main(String[] args) {
        // Runnable r = new Runnable() {
        //     public void run(){
        //         System.out.println("Thread Running...");
        //     }
        // };
        // Thread t1 = new Thread(r);
        // t1.start();

        // Thread t1 = new Thread(new Runnable() {
        //     @Override
        //     public void run() {
        //         System.out.println("Thread Running inner class");
        //     }
        // });
        // t1.start();

        // Thread t1=new Thread(new Runnable(){
        //     public void run(){
        //         System.out.println("Thread Running inner class...");
        //     }
        // });
        // t1.start();

Thread t2 = new Thread(() ->{
    System.out.println("thread runnig..");
});
System.out.println(t2.getState());
t2.start();
System.out.println(t2.getState());

    }
}
