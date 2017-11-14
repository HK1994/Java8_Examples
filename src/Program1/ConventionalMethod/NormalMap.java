package Program1.ConventionalMethod;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hemantkumar on 11/14/2017.
 */
public class NormalMap {
    public static void main(String[] args) {
        Map<String,Integer> items = new HashMap<>();
        items.put("A",10);
        items.put("B",20);
        items.put("C",30);
        items.put("D",40);
        items.put("E",50);


//      Loop a Map

        for (Map.Entry<String,Integer> entry : items.entrySet())
        {
            System.out.println("Item: " + entry.getKey() + "  Count: " +entry.getValue());
        }
    }
}
