package Services;
import User.*;
import Transaction.*;
public class TransferToBank implements Transfer {
    @Override
    public void transfer(User sender, User receiver, double amount) {
        if (sender.getAccount().getBalance() >= amount) {
            // Deduct the amount from the sender's account
            sender.getAccount().withdraw(amount);

            // Add the amount to the receiver's bank account
            receiver.getAccount().deposit(amount);

            // Log the transaction
            Transaction transaction = new Transaction(sender, receiver, amount, "Transfer to Bank");
            sender.addTransaction(transaction);
            receiver.addTransaction(transaction);

            System.out.println("Transfer to Bank successful.");
        } else {
            System.out.println("Insufficient balance for the transfer.");
        }
    }
}
