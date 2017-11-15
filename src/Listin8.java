import java.util.Arrays;
import java.util.List;

/**
 * Created by hemantkumar on 11/15/2017.
 */

//filtering list and get number greater than 3 and even and double it's value
public class Listin8 {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8);

        System.out.println(number.stream()
                                .filter(i-> i>3)
                                .filter(i-> i%2==0)
                                .map(i->i*2)
                                .findFirst()
                                .orElse(0)
        );
    }
}
