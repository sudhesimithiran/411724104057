package Threading;

class Bank
{
    int balance=10000;
    synchronized void withdraw(int amt)
    {
        if(balance<amt)
        {
            System.out.println("Insufficient amount:");
            return;
        }
        System.out.println("amount detected:"+amt);
        balance=balance-amt;
        System.out.println("remaining balance");
        System.out.println(balance);
    }
}
class Customer extends Thread
{
    Bank b;
    int amt;
    Customer(Bank b,int amt)
    {
        this.b=b;
        this.amt=amt;
    }
    public void run()
    {
        b.withdraw(amt);
    }
}


public class ThreadSynchronizationEg {
    public static void main(String[] args) {
        Bank b=new Bank();
        System.out.println("Initial Amount: "+b.balance);
        Customer c1=new Customer(b,7000);
        Customer c2=new Customer(b,3000);
        c1.start();
        c2.start();
        
    }
}