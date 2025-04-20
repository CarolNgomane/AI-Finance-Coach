package creational_patterns;

import aicoach.transaction.Transaction;
import java.util.Date;

public class SimpleTransactionFactory {
    public static Transaction createTransaction(String id, Date date, double amount, String category, String type) {
        Transaction transaction = new Transaction(id, date, amount, category, type);
        return transaction;
    }
}
