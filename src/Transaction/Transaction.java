package Transaction;
import User.User;
import java.util.Date;

public class Transaction {

    private User sender;
    private User receiver;
    private double amount;
    private String description;


    public Transaction(User sender, User receiver, double amount, String description) {

        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.description = description;
    }



    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public static void addTransaction(Transaction transaction, User user) {
        user.addTransaction(transaction);
    }
}

