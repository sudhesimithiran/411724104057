import java.util.Scanner;

public class IPv4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an IPv4 Address:");
        String ip = sc.nextLine();

        String[] parts = ip.split("\\.");

        if (parts.length != 4) {
            System.out.println("Invalid IP: Must have 4 octets");
            return;
        }

        int[] octet = new int[4];

        try {
            for (int i = 0; i < 4; i++) {
                octet[i] = Integer.parseInt(parts[i]);

                if (octet[i] < 0 || octet[i] > 255) {
                    System.out.println("Invalid IP: Each octet must be between 0 and 255");
                    return;
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid IP: Contains non-numeric values");
            return;
        }

        System.out.println("Valid IPv4 Address");

        int first = octet[0];
        String ipClass = "";

        if (first >= 1 && first <= 126)
            ipClass = "Class A";
        else if (first >= 128 && first <= 191)
            ipClass = "Class B";
        else if (first >= 192 && first <= 223)
            ipClass = "Class C";
        else if (first >= 224 && first <= 239)
            ipClass = "Class D (Multicast)";
        else
            ipClass = "Class E (Experimental)";

        System.out.println("IP Class: " + ipClass);

        boolean isPrivate =
        (first == 10) ||
        (first == 172 && octet[1] >= 16 && octet[1] <= 31) ||
        (first == 192 && octet[1] == 168);

if (isPrivate)
    System.out.println(" Type:Private IP ");
else
    System.out.println("Type:Public IP ");

    System.out.println(" NetworkId:");


    if (ipClass.equals("Class A")){
        System.out.println(octet[0]);
        System.out.println("Host ID");
        System.out.println(octet[1]+"."+octet[2]+"."+octet[3]);

    }
    else if (ipClass.equals("Class B")) {
    System.out.println(octet[0] + "." + octet[1]);

    System.out.println("Host ID:");
    System.out.println(octet[2] + "." + octet[3]);
}
else if (ipClass.equals("Class C")) {
    System.out.println(octet[0] + "." + octet[1] + "." + octet[2]);

    System.out.println("Host ID:");
    System.out.println(octet[3]);
}

  sc.close();
    }
}

        
    
    