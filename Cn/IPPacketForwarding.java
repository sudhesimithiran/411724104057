import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class RouteEntry{
    String network;
    String nextHop;
    RouteEntry(String network, String nextHop){
        this.network=network;
        this.nextHop=nextHop;
    }
}
public class IPPacketForwarding{
    //Function to check if destination matches the network prefix
    public static boolean matchPrefix(String destIP, String network){
        String[] netParts=network.split("/");
        String netIP=netParts[0];
        int prefix=Integer.parseInt(netParts[1]);
        String destBinary=toBinary(destIP);
        String netBinary=toBinary(netIP);
        return destBinary.substring(0, prefix).equals(netBinary.substring(0, prefix));
    }
    //Convert IP to Binary format
    public static String toBinary(String ip){
        String[] parts=ip.split("\\.");
        StringBuilder binary=new StringBuilder();
        for(String part:parts){
            String bin=String.format("%8s",Integer.toBinaryString(Integer.parseInt(part))).replace(' ','0');
            binary.append(bin);
        }
        return binary.toString();
    }
    //Longest Prefix Match Logic
    public static String forwardPacket(String destIP,List<RouteEntry>table){
            int longestMatch =-1;
            String nextHop = "No Route Found";


            for(RouteEntry entry:table){
                if (matchPrefix(destIP,entry.network)){
                    int prefix = Integer.parseInt(entry.network.split("/")[1]);
                    if(prefix>longestMatch){
                        longestMatch = prefix;
                        nextHop=entry.nextHop;
                    }

                }

            }
            return nextHop;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            List<RouteEntry> routingTable = new ArrayList<>();


            routingTable.add(new RouteEntry("192.168.1.0/24","Router A"));
        routingTable.add(new RouteEntry("192.168.0.0/16","Router B"));
        routingTable.add(new RouteEntry("10.0.0.0/8","Router C"));
        routingTable.add(new RouteEntry("0.0.0.0/0","Default Gateway"));
        System.out.print("Enter Destination IP Address:");
        String destIP=sc.nextLine();
        String result=forwardPacket(destIP, routingTable);
        System.out.println("Packet forwarded to: "+result);


            

        }

        
}
             
