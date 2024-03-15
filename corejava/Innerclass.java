package corejava;
class A
{
    int age;
    public void show1()
    {
      System.out.println("in show");
    }
    class B
    {
      public void config()
      {
        System.out.println("i am in config!");
      }
    }
}
public class Innerclass {
    public static void main(String[] args) {
        A obj=new A();
        obj.show1();
    }
}
