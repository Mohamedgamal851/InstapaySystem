class MobileAccount implements Account{
    private int myWalletNumber;

    private int MyWalletPassword;

    private double accountBalance;

    private static int walletAccountNumber= 1;

    public MobileAccount(int myWalletNumber, int myWalletPassword) {
        this.myWalletNumber = myWalletNumber;
        MyWalletPassword = myWalletPassword;
        walletAccountNumber = walletAccountNumber+100;
        accountBalance=0;
    }


    @Override
    public double getAccountBalance() {
        return accountBalance;
    }

    @Override
    public int getWalletAccountNumber() {
        return walletAccountNumber;
    }


    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (accountBalance>0)) {
            accountBalance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Withdrawal failed. Insufficient balance or Invalid amount.");
        }
    }

    @Override
    public void deposite(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposit of $" + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}
