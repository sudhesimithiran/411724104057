import java.util.Scanner;

public class ExceptionEg2 {
  public static void main(String[] args) {
    
    try{
             Scanner sc = new Scanner((System.in));
             System.out.println("enter a no:");
             int a = sc.nextInt();
             System.out.println("enter a no:");                  //ArithmeticException
             int b = sc.nextInt();
             int c = a/b;

            System.out.println("a="+a);
            System.out.println("b="+b);
            System.out.println("c="+c);
    } catch (ArithmeticException ae){
      System.out.println(ae.getMessage());
    }

    System.out.println("code outside try block");


    // int a[] = new int[] {1,2,3,4,5};
    // for (int i = 0 ; i <= a.length; i++){        //ArrayIndexOutOfBoundsException
    //     System.out.println(a[i]);
    // }


    // String s = null;                   //NullPointerException
    // System.out.println(s.length());
  }   
}
