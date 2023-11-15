package instapay.strategy;

import Account.BankAccount;
import Services.API;
import java.util.Scanner;
import User.User;

public class BankRegistration implements StrategyRegistration {
    private API api;

    public BankRegistration(API api) {
        this.api = api;
    }

    @Override
    public User SignUp() {
        System.out.println("Bank Registration...");

        // Collect bank-specific registration details
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your bank account number: ");
        int accountNumber = scanner.nextInt();

        // Consume the newline character
        scanner.nextLine();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your accountType: ");
        String accountType = scanner.nextLine();

        // Additional details specific to bank registration
        // For example, you can ask for the account type or any other details specific to your system
        // ...

        // Verify bank using API
        boolean isVerified = api.verify();
        if (isVerified) {
            // Create and return a user object
            User newUser = new User(name,accountType,accountNumber);
            newUser.setAccount(new BankAccount(accountNumber, accountType, name));
            newUser.setUsername(name);  // Assuming username is set using the name entered
            return newUser;
        } else {
            System.out.println("Bank verification failed. Registration aborted.");
            return null;
        }
    }
}
