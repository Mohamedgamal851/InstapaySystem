package Account;

public class BankAccountFactory implements AccountFactory {
    @Override
    public Account createAccount() {
        // Implement logic to create a BankAccount
        // You may prompt the user for details or generate them programmatically
        int bankAccountNumber = 5/* logic to generate a bank account number */;
        int CVV = 5/* logic to generate a CVV */;
        String bankName = "CIB"/* logic to set a bank name */;

        return new BankAccount(bankAccountNumber, CVV, bankName);
    }
}
