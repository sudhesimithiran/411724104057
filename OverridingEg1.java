class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    // overriding
    void sound() {
        System.out.println("Dog barks");
    }
}
public class OverridingEg1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        Animal a = new Dog();   // parent reference, child object
        a.sound();              // runtime polymorphism
    }
}
