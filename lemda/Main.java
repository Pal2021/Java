package lemda;
public class Main {

    public static void main(String[] args) {
        System.out.println("My system starts");
        second i=new second() {
            public void sayhellow(){
                System.out.println("this is first");
        }
    };
    i.sayhellow();
  }
}