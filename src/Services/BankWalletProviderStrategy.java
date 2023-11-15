package Services;

public class BankWalletProviderStrategy implements WalletStrategyProvider {
    @Override
    public void transferToWalletUsingMobileNumber(int mobileNumber, double amount) {
        // Implementation of transferring funds to a wallet using Bank
        System.out.println("Transfer to Wallet using Bank - Mobile Number: " + mobileNumber + ", Amount: " + amount);
        // Actual implementation logic goes here
    }
}
