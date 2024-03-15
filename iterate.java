import java.util.stream.*;
public class iterate {
    public static void main(String[] args) {
        Stream.iterate(1,ele->ele+1).limit(15).forEach(System.out::println);
        System.out.println();
    }
}
