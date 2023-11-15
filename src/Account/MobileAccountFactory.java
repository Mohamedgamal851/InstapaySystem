package Account;

public class MobileAccountFactory implements AccountFactory {
    @Override
    public Account createAccount() {
        int myWalletNumber =5 /* logic to generate a mobile wallet number */;
        int myWalletPassword =5 /* logic to generate a mobile wallet password */;

        return new MobileAccount(myWalletNumber, myWalletPassword);
    }
}
