
    class Parent
{
    int x;
}
class Child extends Parent{
    double y;
}
public class InheritanceExample {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.x = 200;
        System.out.println(p1.x);

        Child ch1 = new Child();
        ch1.x = 101;
        ch1.y = 25.67;
        System.out.println(ch1.x);
        System.out.println(ch1.y);
    }
}
    
