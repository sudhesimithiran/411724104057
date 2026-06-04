// Parent class
class Payment {

    void pay(double amount) {
        System.out.println("Generic payment of " + amount);
    }
}

// Child 1
class CreditCardPayment extends Payment {

    @Override
    void pay(double amount) {
        double charge = amount * 0.02;
        System.out.println("Credit Card Payment: " + (amount + charge));
    }
}

// Child 2
class UPIPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("UPI Payment: " + amount);
    }
}

// Child 3
class CashPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Cash Payment: " + amount);
    }
}

public class OverridingEg2 {                
    public static void main(String[] args) {

        Payment p;

        p = new CreditCardPayment();
        p.pay(1000);

        p = new UPIPayment();
        p.pay(1000);

        p = new CashPayment();
        p.pay(1000);
    }
}