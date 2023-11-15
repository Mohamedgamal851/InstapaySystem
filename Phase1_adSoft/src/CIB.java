public class CIB extends ExternalWallet{

    public CIB(int accountNumber, String accountName) {
        super(accountNumber, accountName);
    }

    @Override
    boolean Verify() {
        return true;
    }
}
