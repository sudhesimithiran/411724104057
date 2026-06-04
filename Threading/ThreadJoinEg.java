package Threading;
class DataProcessing extends Thread{
    public void run(){
        System.out.println("Data is processing....");
        try{
            Thread.sleep(3000);
        }catch(Exception e){}
        System.out.println("Data processing completed..");
    }
}
public class ThreadJoinEg {
    public static void main(String[] args) {
        
    }
}