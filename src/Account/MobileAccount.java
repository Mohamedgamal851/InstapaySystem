package Account;

public class MobileAccount implements Account {
    private int myWalletNumber;
    private int myWalletPassword;
    private double accountBalance;

    public MobileAccount(int myWalletNumber, int myWalletPassword) {
        this.myWalletNumber = myWalletNumber;
        this.myWalletPassword = myWalletPassword;
        this.accountBalance = 0.0; // Initialize balance to zero
    }

    @Override
    public double getBalance() {
        return accountBalance;
    }

    @Override
    public void withdraw(double amount) {
        // Implement withdrawal logic
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + accountBalance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}
