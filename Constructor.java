class A{
    A(){
        System.out.println("Base Constructor");
    }
}
class B extends A{
    B(){
        System.out.println("Derived Constructor");
    }
}
public class Constructor {
    public static void main(String[] args) {
        B b =new B();
    }
}