package Account;

public class BankAccount implements Account {
    private int bankAccountNumber;
    private int CVV;
    private String bankName;
    private double accountBalance;

    public BankAccount(int bankAccountNumber, int CVV, String bankName) {
        this.bankAccountNumber = bankAccountNumber;
        this.CVV = CVV;
        this.bankName = bankName;
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
