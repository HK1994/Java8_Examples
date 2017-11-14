package Program1.ConventionalMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hemantkumar on 11/14/2017.
 */
public class NormalList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hemant");
        list.add("Arpit");
        list.add("Arnav");
        list.add("Jevan");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
