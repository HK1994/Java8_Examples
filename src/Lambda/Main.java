package Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by hemantkumar on 11/13/2017.
 */
public class Main {
    public static void main(String[] args) {
        Trader ram= new Trader("ram", "delhi");
        Trader kapil= new Trader("kapil","noida");
        Trader raj= new Trader("raj","banglore");
        Trader ekta= new Trader("ekta","banglore");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(ram, 2011, 300),
                new Transaction(ram, 2012, 1000),
                new Transaction(kapil, 2011, 400),
                new Transaction(raj, 2012, 710),
                new Transaction(ekta, 2012, 700),
                new Transaction(ekta, 2012, 950)
        );

//        1. Find all transactions in the year 2011 and sort them by value (small to high)
//        2. What are all the unique cities where the traders work?
//        3. Find all traders from delhi and sort them by name.
//        4. Return a string of all traders names sorted alphabetically.
//        5. Are any traders based in Jaipur?
//        6. Print all transactions values from the traders living in delhi
//        7. Whats the highest value of all the transactions?
//        8. Find the transaction with the smallest value

        List<Transaction> yr2011tx = transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());

    }
}
