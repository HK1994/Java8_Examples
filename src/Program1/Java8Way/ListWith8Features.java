package Program1.Java8Way;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hemantkumar on 11/14/2017.
 */
public class ListWith8Features {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Arpit");
        list.add("Shikher");
        list.add("Shushant");
        list.add("Hemant");
        list.add("ABC");
        list.add("KKSS");

        list.forEach((list1)-> System.out.println(list));

//        method reference
        list.forEach(System.out::println);

//        streams

        list.stream().filter(s->s.contains("S")).forEach(System.out::println);

    }
}
