import java.util.Scanner;
public class EmployeeItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of items: ");
        int n = sc.nextInt();
        double totalCost = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("\nItem " + i);
            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            double cost = price * quantity;
            System.out.println("Cost: "+ cost);
            totalCost += cost;
        }
        System.out.println("\nTotal cost: " + totalCost);
        sc.close();
    }
}