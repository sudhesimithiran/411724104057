package Threading;

class Printer {

    public synchronized void print(String name) {

        for (int i = 0; i <= 1; i++) {
            System.out.print("Welcome :: ");

            try {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(name);
        }
    }
}

class MyThread extends Thread {

    Printer d;
    String name;

    MyThread(Printer d, String name) {
        this.d = d;
        this.name = name;
    }

    public void run() {
        d.print(name);
    }
}

public class ThreadSynchronizationEg2 {

    public static void main(String[] args) {

        Printer d1 = new Printer();

        MyThread mt1 = new MyThread(d1, "MSD");
        MyThread mt2 = new MyThread(d1, "Yuvraj");

        mt1.setPriority(Thread.MAX_PRIORITY);
        mt2.setPriority(Thread.MIN_PRIORITY);

        mt1.start();
        mt2.start();
    }
}