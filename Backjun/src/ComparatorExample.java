
import java.util.*;
import  java.util.stream.Stream;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Integer> age = Arrays.asList(5, 15, 25, 45);
        age.stream()
                .filter(a -> a > 15)
                .forEach(a -> System.out.println(a));

        List<String>  name = Arrays.asList("larva", "duck", "cat");

        name.stream()

                .peek(s -> System.out.println(s))
                .map(s -> s.toUpperCase(Locale.ROOT))
                .forEach(s -> System.out.println(s));

    }

}
