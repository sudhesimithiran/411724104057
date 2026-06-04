package Collection;
class Test <T>
{
    T obj;
    void add(T obj){
        this.obj = obj;
    }
    T get(){
        return obj;
    }
}

public class GenericsEg2{
    public static void main(String[] args) {
        Test<Double> t1 = new Test<Double>();
        t1.add(3.5);
        System.out.println(t1.get());

        Test<String>t2 = new Test<>();
        t2.add("hello");
        System.out.println(t2.get());
    }
}
