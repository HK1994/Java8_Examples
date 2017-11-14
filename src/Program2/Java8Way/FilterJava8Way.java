package Program2.Java8Way;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by hemantkumar on 11/14/2017.
 */
public class FilterJava8Way {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("spring", "node", "mkyong");
        list.stream().filter(s->!"mkyong".equals(s)).collect(Collectors.toList()).forEach(System.out::println);
//        result.forEach(System.out::println);

    }
}
