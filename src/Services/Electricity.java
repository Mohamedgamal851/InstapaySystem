package Services;

public class Electricity extends Bill {
    public Electricity(double amount, String description) {
        super(amount, description);
    }

    @Override
    public void takeDetails() {
        // Implementation to take details specific to Electricity bill
        System.out.println("Taking details for Electricity bill...");
        // Actual implementation logic goes here
    }

    @Override
    public boolean verify() {
        // Implementation to verify Electricity bill
        System.out.println("Verifying Electricity bill...");
        // Actual implementation logic goes here
        return true; // Placeholder, replace with actual verification logic
    }
}
