package corejava; 

class mobile {
    String name; 
    int count;
    static String brand; 

    void print() {
        System.out.println("name is " + name + " " + brand + " " + count); 
    }
}

public class Static {
    public static void main(String args[]) {
        mobile m1 = new mobile();
        mobile m2 = new mobile();
        m1.name = "iphone";
        m1.count = 5;
        mobile.brand = "is made by apple";
        m2.name = "samsung";
        m2.count = 8;
        mobile.brand="kjscd";
        m1.print();
      
        m2.print();
    }
}
