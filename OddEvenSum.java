import java.util.Scanner;
public class OddEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int oddSum = 0, evenSum = 0;
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0)
                evenSum += arr[i];
            else
                oddSum += arr[i];
        }
        System.out.println("Sum of Even elements: " + evenSum);
        System.out.println("Sum of Odd elements: " + oddSum);
        sc.close();
    }
}