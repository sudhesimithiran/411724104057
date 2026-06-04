public class ReThrowingEx {

    public static void dostuff()
    {
        try {
            int a = 10/0;

        } catch (ArithmeticException e) {
          System.out.println("exception thrown");
          throw e;// rethrowing exception
        }
    }
    public static void main(String[] args) {
        try {
            dostuff();
        } catch (Exception e) {
            System.out.println("exception handled ");
            System.out.println(e);
        }
        
    }
    
}
