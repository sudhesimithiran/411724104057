import java.io.*;
import java.net.*;


public class EchoServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5000);
            System.out.println("Server started... Waiting for cilent");

            Socket socket = server.accept();
            System.out.println("Cilent connected ");

            BufferedReader input = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
            );
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            String msg = input.readLine();
            System.out.println("Cilent: "+ msg);

            output.println("Echo: "+ msg);

            socket.close();
            server.close();
            
        } catch (Exception e) {
            System.out.println(e);
        
    }

}
}


 
