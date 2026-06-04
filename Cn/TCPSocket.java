
import java.io.*;
import java.net.*;

public class TCPSocket {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server is waiting for client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader console = new BufferedReader(
                    new InputStreamReader(System.in));

            String message;

            while (true) {
                // Receive message from client
                message = input.readLine();
                System.out.println("Client: " + message);

                if (message.equalsIgnoreCase("exit")) {
                    break;
                }

                // Send reply to client
                System.out.print("Server: ");
                String reply = console.readLine();
                output.println(reply);
            }

            socket.close();
            serverSocket.close();
            System.out.println("Connection closed.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}    
// import java.io.*;
// import java.net.*;

// public class TcpSocket{
//     public static void main(String[] args) {
//         try {
//             ServerSocket serverSocket = new ServerSocket(5000);
//             System.out.println("Server is waiting for client...");

//             Socket socket = serverSocket.accept();
//             System.out.println("Client connected!");

//             BufferedReader input = new BufferedReader(
//                     new InputStreamReader(socket.getInputStream()));
//             PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

//             BufferedReader console = new BufferedReader(
//                     new InputStreamReader(System.in));

//             String message;

//             while (true) {
//                 // Receive message from client
//                 message = input.readLine();
//                 System.out.println("Client: " + message);

//                 if (message.equalsIgnoreCase("exit")) {
//                     break;
//                 }

//                 // Send reply to client
//                 System.out.print("Server: ");
//                 String reply = console.readLine();
//                 output.println(reply);
//             }

//             socket.close();
//             serverSocket.close();
//             System.out.println("Connection closed.");

//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }

