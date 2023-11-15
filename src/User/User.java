package User;// User.java

import Account.Account;
import Transaction.Transaction;

public class User {
    private String username;
    private String password;
    private int mobileNumber;
    private Account account; // Assuming User has an associated Account

    public User(String username, String password, int mobileNumber) {
        this.username = username;
        this.password = password;
        this.mobileNumber = mobileNumber;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }


    public void addTransaction(Transaction transaction) {
    }
}
