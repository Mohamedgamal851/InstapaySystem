package Services;

public class Fawry implements ExternalWallet {
    private int accountNumber;
    private String accountName;
    private API api;

    public Fawry(int accountNumber, String accountName, API api) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.api = api;
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getAccountName() {
        return accountName;
    }

    @Override
    public API getApi() {
        return api;
    }

    @Override
    public void deposit(double amount) {
        // Implement deposit logic for Fawry wallet
    }

    @Override
    public void withdraw(double amount) {
        // Implement withdrawal logic for Fawry wallet
    }

    public void verify() {
        // Implementation of verification for Fawry
    }
}
