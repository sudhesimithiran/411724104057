import java.util.*;
public class AssertionEg {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age:");
        int age=sc.nextInt();
        assert age>=0 : "Invalid Age";
        System.out.println("Age:"+age);
    }
}
