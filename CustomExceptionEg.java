import java.util.Scanner;

class LoginValidatiionException extends Exception
{
    String message;
    public LoginValidatiionException(){}
    public LoginValidatiionException(String msg){
        message = msg;
    }
    @Override
    public String getMessage()
    {
        return message;
    }
    @Override
    public String toString()
    {
        return message;
    }
}





public class CustomExceptionEg {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a username:");
            String uname = sc.nextLine();
            if(!uname.equals("admin"))

            {
                throw new LoginValidatiionException("Invalid user name");
            }
            System.out.println("Valid user !");

            
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        
    }
    
}
