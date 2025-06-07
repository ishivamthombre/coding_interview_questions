package transaction_sum;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<Transaction> transactions =
        Arrays.asList(new Transaction("2022-01-01", 100), new Transaction("2022-01-01", 200), new Transaction("2022-01-02", 300),
            new Transaction("2022-01-02", 400), new Transaction("2022-01-03", 500));

    Map<String, Integer> sum =
        transactions.stream().collect(Collectors.groupingBy(Transaction::getDate, Collectors.summingInt(Transaction::getAmount)));

    sum.forEach((key, value) -> System.out.println("Transaction Date : " + key + " Sum : " + value));

    //Part	                            Purpose
    //stream()	                        Converts list to stream
    //collect()	                        Terminal operation to reduce into a Map
    //groupingBy()	                    Groups transactions by date
    //Transaction::getDate	            Date used as map key
    //summingInt()	                    Sums amounts for each date group
  }
}

