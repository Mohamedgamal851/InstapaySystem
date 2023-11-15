public class VodafoneCash extends ExternalWallet{
    public VodafoneCash(int accountNumber, String accountName) {
        super(accountNumber, accountName);
    }

    @Override
    boolean Verify() {
        return true;
    }
}
