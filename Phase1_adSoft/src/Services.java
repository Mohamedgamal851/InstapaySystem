class Services {
    void transferToWalletUsingMobileNumber(double amount,User user){
        Transfer transfer=new TransferToWallet();
        transfer.excute(amount,user);
    };

    void transferToAnotherInstapayAccount(double amount,User user){
        Transfer transfer=new TransferToAnotherInstapayAccount();
        transfer.excute(amount,user);
    };

    void transferToBankAccount(double amount,User user){
        Transfer transfer=new TransferToBankAccount();
        transfer.excute(amount,user);
    };

    void inquireAboutBalance(User user){
        System.out.print("Your current Balance is"+user.getAcc().getAccountBalance());
    };

    void payBills(Bill bill,User user){
        bill.takeDetails(user);
    };
}