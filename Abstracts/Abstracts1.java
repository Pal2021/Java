abstract class parent {
    public parent() {
        System.out.println("I am parent");
    }

    public void hellow() {
        System.out.println("Hello");
    }

    abstract public void greet();
}

class child2 extends parent {
    public void greet() {
        System.out.println("Good morning");
    }
}

public class Abstracts1 {
    public static void main(String[] args) {
        child2 c = new child2();
        c.greet();
    }
}
