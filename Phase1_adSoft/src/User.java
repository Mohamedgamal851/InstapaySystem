class User {
    private String username;
    private String password;
    private int mobileNumber;
    private  Account Acc;

    public User(String username, String password, int mobileNumber, Account acc) {
        this.username = username;
        this.password = password;
        this.mobileNumber = mobileNumber;
        Acc = acc;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }


    public Account getAcc() {
        return Acc;
    }
}
