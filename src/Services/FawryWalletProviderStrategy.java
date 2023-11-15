package Services;

public class FawryWalletProviderStrategy implements WalletStrategyProvider {
    @Override
    public void transferToWalletUsingMobileNumber(int mobileNumber, double amount) {
        // Implementation of transferring funds to a wallet using Fawry
        System.out.println("Transfer to Wallet using Fawry - Mobile Number: " + mobileNumber + ", Amount: " + amount);
        // Actual implementation logic goes here
    }
}
