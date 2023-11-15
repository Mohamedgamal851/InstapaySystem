public class BankAccount implements Account{
        private int BankAccountNumber;

        private String BankName;

        private int CVV;

        private double accountBalance;

        private static int walletAccountNumber= 0;

        public BankAccount(int bankAccountNumber, String bankName, int cvv) {
            BankAccountNumber = bankAccountNumber;
            BankName = bankName;
            CVV = cvv;
            walletAccountNumber = walletAccountNumber+10;
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
            double overdraftLimit = -500; // Example overdraft limit

            if (amount > 0 && (accountBalance - amount) >= overdraftLimit) {
                accountBalance -= amount;
                System.out.println("Withdrawal of $" + amount + " successful.");
            } else {
                System.out.println("Withdrawal failed. Insufficient funds or exceeds overdraft limit.");
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
