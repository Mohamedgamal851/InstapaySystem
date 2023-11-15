package Services;

public interface ExternalWallet {
    int getAccountNumber();
    String getAccountName();
    API getApi();
    void deposit(double amount);
    void withdraw(double amount);
}
