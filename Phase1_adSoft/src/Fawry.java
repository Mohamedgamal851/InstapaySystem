public class Fawry extends ExternalWallet{
    public Fawry(int accountNumber, String accountName) {
        super(accountNumber, accountName);
    }

    @Override
    boolean Verify() {
        return true;
    }
}
