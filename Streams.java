
import java.util.ArrayList;

import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args){
        ArrayList<Integer>nums=new ArrayList<>();
        nums.add(13);
        nums.add(156);
        nums.add(13);
        nums.add(12);
        nums.add(98);

       ArrayList<Integer> ans=new ArrayList<>();
      ans=nums.stream().filter(n->n%2==0).collect(Collectors.toCollection(ArrayList::new));
      for(int i=0;i<ans.size();i++)
      {
          System.out.println(ans.get(i));
      }
    }
}
