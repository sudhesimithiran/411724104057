import java.util.Scanner;
import java.util.regex.Pattern;

public class IPv6 {

    // Regular expression for IPv6 validation
    private static final String IPV6_REGEX =
            "^(([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}|" +
            "([0-9a-fA-F]{1,4}:){1,7}:|" +
            "([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|" +
            "([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|" +
            "([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}|" +
            "([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|" +
            "([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|" +
            "[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|" +
            ":((:[0-9a-fA-F]{1,4}){1,7}|:))$";

    public static boolean isValidIPv6(String ip) {
        return Pattern.matches(IPV6_REGEX, ip);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an IPv6 address: ");
        String ipAddress = sc.nextLine();

        // ✅ Changed here
        if (isValidIPv6(ipAddress)) {
            System.out.println("Valid IPv6 Address");
        } else {
            System.out.println("Invalid IPv6 Address");
        }

        sc.close();
    }
}