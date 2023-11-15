import java.util.Scanner;

public class TransferToWallet implements Transfer {
    ExternalWallet EW;

    WalletStrategyProvider WalletProvider;

    @Override
    public void excute(double amount,User user) {
        Scanner scanner = new Scanner(System.in);
        int userSelectedWalletType ;
        System.out.println("Enter Type of Wallet you need to transfer to it:" +
                "1.Fawry"
        +       "2.Bank Wallet" +
                "3.Mobile Wallet"         );
        userSelectedWalletType=scanner.nextInt();
        int accountNo;
        String accountName;
        switch (userSelectedWalletType) {
            case 1:
                System.out.println("Enter accountNo:");
                accountNo=scanner.nextInt();
                System.out.println("Enter accountName:");
                accountName=scanner.nextLine();
                EW=new Fawry(accountNo,accountName);
                if(EW.Verify()) {
                    WalletProvider = new FawryWalletProviderStrategy();
                    WalletProvider.transferToWalletUsingMobileNumber(accountNo, amount, user); // Pass mobile number and amount
                     }
                break;
            case 2:
                System.out.println("Enter accountNo:");
                accountNo=scanner.nextInt();
                System.out.println("Enter accountName:");
                accountName=scanner.nextLine();
                EW=new CIB(accountNo,accountName);
                if(EW.Verify()) {
                    WalletProvider = new BankWalletProviderStrategy();
                    WalletProvider.transferToWalletUsingMobileNumber(accountNo, amount, user); // Pass mobile number and amount
                }
                break;
            case 3:
                System.out.println("Enter accountNo:");
                accountNo=scanner.nextInt();
                System.out.println("Enter accountName:");
                accountName=scanner.nextLine();
                EW=new CIB(accountNo,accountName);
                if(EW.Verify()) {
                    WalletProvider = new MobileWalletProviderStrategy();
                    WalletProvider.transferToWalletUsingMobileNumber(accountNo, amount, user); // Pass mobile number and amount
                }
                break;
            default:
                System.out.println("Invalid wallet type selected!");
                break;
        }

    }


}
