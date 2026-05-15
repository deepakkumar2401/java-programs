package interview_related;


import java.util.*;
import java.util.stream.Collectors;

class Transaction {
    int userId;
    double amount;
    int month;

    public Transaction(int userId, double amount, int month) {
        this.userId = userId;
        this.amount = amount;
        this.month = month;
    }

    public int getUserId() {
        return userId;
    }

    public double getAmount() {
        return amount;
    }

    public int getMonth() {
        return month;
    }

    @Override
    public String toString() {
        return "userId=" + userId + " Amount=" + amount + " Month=" + month;
    }
}

public class GroupByUse {

    public static void main(String[] args) throws Exception {
        List<Transaction> list = List.of(

                new Transaction(1, 300, 3),
                new Transaction(1, 200, 3),
                new Transaction(2, 400, 4),
                new Transaction(1, 600, 4)
        );

        Map<Integer, Map<Integer, DoubleSummaryStatistics>> result = list.stream().
                collect(Collectors.groupingBy(Transaction::getUserId,
                        Collectors.groupingBy(Transaction::getMonth,
                                Collectors.summarizingDouble(Transaction::getAmount))));

        System.out.println(result);
    }

}
