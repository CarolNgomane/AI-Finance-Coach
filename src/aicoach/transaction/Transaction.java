package aicoach.transaction;

import java.util.Date;

public class Transaction {
    private String transactionId;
    private Date date;
    private float amount;
    private String category;
    private String type;

    public Transaction(String transactionId, Date date, double amount, String category, String type) {
        this.transactionId = transactionId;
        this.date = date;
        this.amount = amount;
        this.category = category;
        this.type = type;
    }

    public void recordTransaction() {
        System.out.println("Transaction recorded: " + transactionId);
    }

    public void editTransaction(float newAmount) {
        this.amount = newAmount;
    }
}