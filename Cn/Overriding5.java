public class Overriding5{
    public static void main(String[] args) {
        String s1=  new String("abc");
        String s2= new String("abc");
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
    }
}