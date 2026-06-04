package Threading;

public class MultiThreadEg {
    public static void main(String[] args) {
        OddThread t1= new OddThread();
        EvenThread t2= new EvenThread();
        t1.start();
        t2.start();
    }
}
class OddThread extends Thread{
    public void run(){
        for(int i=1;i<5;i+=2){
            System.out.println("Odd - Count: "+i);
        }
    }
}
class EvenThread extends Thread{
    public void run(){
        for(int i=0;i<5;i+=2){
            System.out.println("Even - Count: "+i);
        }
    }
}