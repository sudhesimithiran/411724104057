package Threading;
public class ThreadEg {
    public static void main(String[] args) {
        java.lang.Thread t = java.lang.Thread.currentThread();
        System.out.println("Name of thread is: " + t.getName());
        System.out.println("Thread class: " + t.getClass());
        System.out.println("State: " + t.getState());
    }
}