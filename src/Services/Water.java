package Services;

public class Water extends Bill {
    public Water(double amount, String description) {
        super(amount, description);
    }

    @Override
    public void takeDetails() {
        // Implementation to take details specific to Water bill
        System.out.println("Taking details for Water bill...");
        // Actual implementation logic goes here
    }

    @Override
    public boolean verify() {
        // Implementation to verify Water bill
        System.out.println("Verifying Water bill...");
        // Actual implementation logic goes here
        return true; // Placeholder, replace with actual verification logic
    }
}