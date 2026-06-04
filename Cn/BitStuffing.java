import java.util.Scanner;
public class BitStuffing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        //Input data
        System.out.print("Enter the data bits");
        String data = sc.nextLine();

        String stuffedData = "";
        int count = 0;

        //Bit stuffing logic
        for(int i = 0; i < data.length(); i++) {
            char bit = data.charAt(i);
            stuffedData += bit;

            if(bit == '1') {
                count++;
            }else{
                count = 0;
            }

            //Insert '0' after every 5 bits
            if(count == 5) {
                stuffedData += "0";
                count = 0;
            }
            String flag = "01111110";

            String transmittedFrame = flag + stuffedData + flag;
    }
}