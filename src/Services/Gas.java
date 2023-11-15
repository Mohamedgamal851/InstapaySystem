package Services;

public class Gas extends Bill {
    public Gas(double amount, String description) {
        super(amount, description);
    }

    @Override
    public void takeDetails() {
        // Implementation to take details specific to Gas bill
        System.out.println("Taking details for Gas bill...");
        // Actual implementation logic goes here
    }

    @Override
    public boolean verify() {
        // Implementation to verify Gas bill
        System.out.println("Verifying Gas bill...");
        // Actual implementation logic goes here
        return true; // Placeholder, replace with actual verification logic
    }
}
