package Collection;

class Test <T>
{
    T obj;
}

public class GenericsEg1
{
    public static void main(String[] args) 
    {
        Test <Double> t1 = new Test <Double>();
        Test <Integer> t2 = new Test <Integer>();
        Test <String> t3 = new Test <String>();
        t1.obj = 4.5;
        t2.obj = 15;
        t3.obj = "abc";
        System.out.println(t1.obj);
        System.out.println(t2.obj);   
        System.out.println(t3.obj);
        
        
    }
}