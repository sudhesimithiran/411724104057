import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (n == 0 || n == 1) {
            System.out.println("Not a Prime number");
        }else if (n == 2) {
            System.out.println("Prime number");
        }else {
            boolean isPrime = true;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
              break;
                }
            }
            if (isPrime) {
                System.out.println("Prime number");
            }else {
                System.out.println("Not a Prime number");
            }
        }
        sc.close();
    }
}