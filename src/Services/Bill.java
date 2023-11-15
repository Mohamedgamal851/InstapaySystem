package Services;

public abstract class Bill {
    private double amount;
    private String description;

    public Bill(double amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    public abstract void takeDetails();

    public abstract boolean verify();

    public void deductFromUserAccount() {
        // Implementation to deduct the bill amount from the user's account
        System.out.println("Deducting $" + amount + " from the user's account for: " + description);
        // Actual implementation logic goes here
    }
}
