package Services;
import java.util.ArrayList;
import java.util.List;
public class Services {
    private List<String> allServices;

    public Services() {
        this.allServices = new ArrayList<>();
        // Initialize the list with some example services
        allServices.add("Transfer to Wallet");
        allServices.add("Transfer to Another Instapay Account");
        allServices.add("Transfer to Bank Account");
        allServices.add("Inquire about Balance");
        allServices.add("Pay Bills");
    }

    public void displayAllServices() {
        System.out.println("All available services:");
        for (String service : allServices) {
            System.out.println("- " + service);
        }
    }

    public void displayServicesExceptTransferToBank() {
        System.out.println("Available services (excluding Transfer to Bank Account):");
        for (String service : allServices) {
            if (!service.equals("Transfer to Bank Account")) {
                System.out.println("- " + service);
            }
        }
    }
}
