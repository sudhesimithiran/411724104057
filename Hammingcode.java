import java.util.Scanner;

public class Hammingcode {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        int[] data = new int[4];
        int[] hamming = new int[8];

        System.out.println("Enter 4 bits (D1 D2 D3 D4:");
         for (int i = 0; i < 4; i++){
            data [i] = sc.nextInt();
         }

         hamming[3] = data[0];
         hamming[5] = data[1];
         hamming[6] = data[2];
         hamming[7] = data[3];

 
        hamming[1] = hamming[3]^hamming[5]^hamming[7];
        hamming[2] = hamming[3]^hamming[6]^hamming[7];
        hamming[4] = hamming[5]^hamming[6]^hamming[7];

        System.out.println("\nGenerated hamming Code:");

        for(int i = 1 ; i <= 7; i++){
            System.out.print(hamming[i] + " ");

        }

        System.out.println("\n\nEnter received 7-bit Hamming code:");

        for (int i = 1; i <= 7; i++) {
            hamming[i]=sc.nextInt();
        }


        int p1 = hamming[1]^hamming[3]^hamming[5]^hamming[7];
        int p2 = hamming[2]^hamming[3]^hamming[6]^hamming[7];
        int p4 = hamming[4]^hamming[5]^hamming[6]^hamming[7];


        int errorPosition = p4*4+p2*2+p1; 
        
        if (errorPosition==0) {
            System.out.println("\nNo error detected.");
            
        }else {
            System.out.println("\nError deteced at position: " + errorPosition);

            hamming[errorPosition]=
            (hamming[errorPosition]==0)? 1:0;


            System.out.println("Corrected Hamming code:");

            for (int i = 1; i <= 7; i ++ ){
                System.out.println(hamming[i] + " ");

            }


        }
          sc.close();
    }



}