
public class Static_class{
    int a=20;
    static int b=40;
    public static void fun1(){
        System.out.println("Hello World1");
    }
    public void fun2(){
        System.out.println("Hello World2");
    }
    
    public static void main(String args[]){
        Static_class.fun1();
        Static_class obj=new Static_class();
        obj.fun2();
        System.out.println(Static_class.b);
        System.out.println(b);
        System.out.println(obj.a);
    }
}