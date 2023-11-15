abstract class Bill {
    protected double amount;

    protected String description;

    public abstract void takeDetails(User user);

    protected boolean verify(String SerialNum,String Provider) {
        API api=new GovernementApi();
        return api.Verify() ;
    }

    public void deductFromUserAccount(User user) {
        user.getAcc().withdraw(amount);
    }

}