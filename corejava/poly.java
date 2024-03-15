package corejava;
class A{
  void show()
  {
    System.out.println("I am in A");
  }
}
class B extends A{
    void show()
    {
        System.out.println("I am in B");
    }
}
class C extends B{
    void show()
    {
        System.out.println("I am in C");
    }
}
public class poly {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show();
        obj1=new B();
        obj1.show();
        obj1=new C();
        obj1.show();
    }
}
