import java.util.Date;

class Transaction {
    private static int transactionCounter = 1;
    private int transactionId;
    private User sender;
    private double amount;
    private String description;
    private Date timestamp;

    public Transaction(User sender, double amount, String description) {
        this.transactionId = transactionCounter++;
        this.sender = sender;
        this.amount = amount;
        this.description = description;
        this.timestamp = new Date();
    }

    public int getTransactionId() {
        return transactionId;
    }

    public User getSender() {
        return sender;
    }


    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public Date getTimestamp() {
        return timestamp;
    }
}
