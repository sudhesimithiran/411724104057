interface Remote {

    void switchOn();   // abstract by default
    void switchOff();
}

class TV implements Remote {

    public void switchOn() {
        System.out.println("TV ON");
    }

    public void switchOff() {
        System.out.println("TV OFF");
    }
}

public class InterfaceEg1 {
    public static void main(String[] args) {

        Remote r = new TV();
        r.switchOn();
        r.switchOff();
    }
}