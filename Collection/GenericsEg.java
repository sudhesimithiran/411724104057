package Collection;

class Test <T>{
    T obj;
}

public class GenericsEg {
    public static void main(String[] args) {
        Test<Double> t1=new Test<Double>();
        t1.obj=4.5;
        System.out.println(t1.obj);
    }
}
