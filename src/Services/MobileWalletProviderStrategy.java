package Services;

public class MobileWalletProviderStrategy implements WalletStrategyProvider {
    @Override
    public void transferToWalletUsingMobileNumber(int mobileNumber, double amount) {
        // Implementation of transferring funds to a wallet using Mobile
        System.out.println("Transfer to Wallet using Mobile - Mobile Number: " + mobileNumber + ", Amount: " + amount);
        // Actual implementation logic goes here
    }
}
