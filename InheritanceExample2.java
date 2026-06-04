class Parent {
    Parent()
    {
        System.out.println("parent empty constructor");
    }
    Parent(String msg)
    {
        System.out.println("parent param constructor");
    }
}
class Children extends Parent
{
    Children()
    {
        System.out.println("child empty constructor");
    }
    Children(String msg)
    {
            System.out.println("child param constructor");
    }
}

public class InheritanceExample2 {
    public static void main(String[] args) {
        Children c = new Children("hello");
    }
}