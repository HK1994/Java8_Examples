package Program2.Java8Way;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hemantkumar on 11/14/2017.
 */
public class FilterPerson {
    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );


        Person result1 = persons.stream().filter(x->"jack".equals(x.getName()))
                .findAny()
                .orElse(null);

        System.out.println(result1);
            }
}
