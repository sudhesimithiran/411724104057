import java.net.*;

public class InetNetwork {

    public static void main(String[] args) {
        try {
            // Get local host info
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host Name: " + localHost.getHostName());
            System.out.println("Local IP Address: " + localHost.getHostAddress());

            // Get IP from user input or domain
            String host = "www.google.com";
            InetAddress inet = InetAddress.getByName(host);

            System.out.println("\nHost Name: " + inet.getHostName());
            System.out.println("Host IP: " + inet.getHostAddress());

        } catch (UnknownHostException e) {
            System.out.println("Host not found: " + e.getMessage());
        }
    }
}
