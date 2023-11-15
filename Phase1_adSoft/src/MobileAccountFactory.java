import java.util.Scanner;

public class MobileAccountFactory implements AccountFactory{
    @Override
    public Account CreateAcc() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Wallet Number:");
        int WalletNumber = scanner.nextInt();

        System.out.println("Enter Password:");
        int Pass = scanner.nextInt();

        // Creating a BankAccount object using the provided information
        MobileAccount mobileAccount = new MobileAccount(WalletNumber,Pass);

        return mobileAccount;
    }
}
