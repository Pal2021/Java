public class static_class2 {
    private static int a=20;
    private int b=30;
    public static class classA{
        public void printval(){
            System.out.println("hellow");
        }
    }
    public static void main(String[] args) {
         System.out.println(a);
         static_class2 obj1=new static_class2();
         System.out.println(obj1.b);
         classA obj2=new classA();
         obj2.printval();
         static_class2.classA obj3=new static_class2.classA();
         obj3.printval();
        
    }
}
