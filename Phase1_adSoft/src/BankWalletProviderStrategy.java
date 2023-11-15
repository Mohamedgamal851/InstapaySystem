public class BankWalletProviderStrategy implements WalletStrategyProvider {
    @Override
    public void transferToWalletUsingMobileNumber(int accountNumber, double amount,User user) {
        user.getAcc().withdraw(amount);
        System.out.println("Transfer to wallet done successfully in Bank Wallet to "+accountNumber );
    }
}
