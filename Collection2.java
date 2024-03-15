import java.util.*;

class employee{
    String name;
    int id;
    String gender;
    int salary;
    employee(String name,int id,String gender,int salary)
    {
        this.name=name;
        this.id=id;
        this.gender=gender;
        this.salary=salary;
    }
}
public class Collection2 {
    public static void main(String args[]){
        ArrayList<employee>nums=new ArrayList<>();
        nums.add(new employee("Mr pal",123,"M",500000));
        nums.add(new employee("Raj",234,"M",23000));
        nums.add(new employee("dwchkd",343,"F",493));
        nums.add(new employee("wqh",3,"F",283243));
        nums.stream().filter(x->x.salary>10000&& x.gender.equals("M")).forEach(x-> System.out.println(x.name));
    }
}
