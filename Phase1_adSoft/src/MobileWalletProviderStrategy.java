public class MobileWalletProviderStrategy implements WalletStrategyProvider{
    @Override
    public void transferToWalletUsingMobileNumber(int accountNumber, double amount, User user) {
            user.getAcc().withdraw(amount);
            System.out.println("Transfer to wallet done successfully in mobile Wallet to"+accountNumber);

    }
}
