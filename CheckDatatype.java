import java.util.Scanner;

public class CheckDatatype {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value:");
        Object input = sc.next();

        if (input instanceof String) {
            System.out.println("Valid Datatype: String");
        } 
        else {
            System.out.println("Invalid Datatype");
        }

        sc.close();
    }
}