public class BillFactory {
    static Bill bill;
    public static Bill createBill(String type) {
        switch (type.toLowerCase()) {
            case "gas":
                bill=new Gas();
                return bill ;// Assuming GasBill is a class representing the Gas bill
            case "water":
                bill=new Water();
                return bill; // Assuming WaterBill is a class representing the Water bill
            case "electricity":
                bill=new Electricity();
                return bill ;// Assuming ElectricityBill is a class representing the Electricity bill
            default:
                throw new IllegalArgumentException("Invalid bill type: " + type);
        }
    }
}
