class Test {  }

public class Constantexample4 {

    public static void main(String[] args) {
        Test t;
        t  = new Test();

        System.out.println(System.identityHashCode(t));

        t = new Test();
        System.out.println(System.identityHashCode(t));
    }
}