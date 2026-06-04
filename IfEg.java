import java.util.*;
public class IfEg {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amt:");
        double amt=sc.nextDouble();
        double damt=0.0;

        // damt=(amt>=1000)? amt *0.10 : amt*0.05;
        
        if(amt>=10000){
            damt=amt*0.20;
        }else if(amt>=5000 && amt<10000){
            damt=amt*0.15;
        }else if(amt>=1000 && amt<5000){
            damt=amt*0.10;
        }
        else{
            damt=amt*0.05;
        }
        double pamt=amt-damt;
        System.out.printf("Amount: %8.2f\n",amt);
        System.out.printf("Discount: %8.2f\n",damt);
        System.out.printf("Payable: %8.2f",pamt);
        sc.close();
    }
}