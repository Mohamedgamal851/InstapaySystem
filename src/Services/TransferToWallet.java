package Services;
import User.*;
import Transaction.*;
public class TransferToWallet implements Transfer {
    @Override
    public void transfer(User sender, User receiver, double amount) {
        if (sender.getAccount().getBalance() >= amount) {
            // Deduct the amount from the sender's account
            sender.getAccount().withdraw(amount);

            // Add the amount to the receiver's wallet
            receiver.getAccount().deposit(amount);

            // Log the transaction
            Transaction transaction = new Transaction(sender, receiver, amount, "Transfer to Wallet");
            sender.addTransaction(transaction);
            receiver.addTransaction(transaction);

            System.out.println("Transfer to Wallet successful.");
        } else {
            System.out.println("Insufficient balance for the transfer.");
        }
    }
}
