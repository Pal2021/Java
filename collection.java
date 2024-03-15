import java.util.ArrayList;
import java.util.stream.*;
    public class collection {
        public static void main(String args[])
        {
            ArrayList<Integer>arr=new ArrayList<>();
            arr.add(3);
            arr.add(3);
            arr.add(4);
            arr.add(1);
            arr.add(0);
            System.out.println(arr);
            Stream<Integer>str=arr.stream();
            str=str.distinct().sorted();
            str.forEach(x->System.out.println(x));

        }
    }


