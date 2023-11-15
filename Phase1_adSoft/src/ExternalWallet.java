abstract class ExternalWallet {
    private int accountNumber;
    private String accountName;

    private API api;


    public ExternalWallet(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }
   abstract  boolean Verify();
}