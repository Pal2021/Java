package corejava;
class finddata{
   private String name;
   private int age;
  
  public finddata(String name, int age) {
    this.name = name;
    this.age = age;
}
public int  getage()
  {
    return age;
  }
  public String  getname()
  {
    return name;
  }
}
public class Encapsulation {
   public static void main(String[] args) {
    finddata person1=new finddata("prashant Pal", 23);
    System.out.println(person1.getname() +" age is "+person1.getage());
   } 
}
