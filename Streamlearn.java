import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class Streamlearn {
    public static void main(String[] args) {
        List<Integer> salary = Arrays.asList(3000, 40000, 10000);
        Stream<Integer> conStream = salary.stream();
        conStream.filter(x->x>3000).forEach(System.out::println);
        // Rest of your code...
    }
}
