package Program2.ConventionalMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hemantkumar on 11/14/2017.
 */
public class FilterListTraditionalWay {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("A","B","C","D");
        List<String> result = getFilteredOutput(list1,"C");

        for (String temp:result)
        {
            System.out.println(temp);
        }

    }

    private static List<String> getFilteredOutput(List<String> list,String filter){
        List<String> result = new ArrayList<>();
        for (String line : list) {
            if (!"A".equals(line)) { // we dont like mkyong
                result.add(line);
            }
        }
        return result;

    }
}
