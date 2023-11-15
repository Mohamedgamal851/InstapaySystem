package Services;

public class BillsFactory {
    public Bill createBill(String type, double amount, String description) {
        // Implementation to create a bill based on the provided type
        switch (type.toLowerCase()) {
            case "gas":
                return new Gas(amount, description);
            case "electricity":
                return new Electricity(amount, description);
            case "water":
                return new Water(amount, description);
            default:
                throw new IllegalArgumentException("Unsupported bill type: " + type);
        }
    }
}
