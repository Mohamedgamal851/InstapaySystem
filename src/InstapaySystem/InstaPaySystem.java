package InstapaySystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Services.*;
import Account.*;
import Transaction.*;
import User.User;
public class InstaPaySystem {
    private List<User> users;
    private List<Transaction> transactions;
    private Services services;
    private AuthenticationService authenticationService;

    public InstaPaySystem(AuthenticationService authenticationService) {
        this.users = new ArrayList<>();
        this.transactions = new ArrayList<>();
        this.services = new Services();
        this.authenticationService = authenticationService;
    }

    public void SignIn() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Authenticate user using the provided AuthenticationService
        User user = authenticationService.authenticateUser(username, password);

        if (user != null) {
            System.out.println("Sign in successful. Welcome, " + username + "!");
            loadUserProfile(user);
        } else {
            System.out.println("Invalid username or password. Sign in failed.");
        }
    }

    public void loadUserProfile(User user) {
        // Assuming User class has a reference to an Account
        Account userAccount = user.getAccount();

        if (userAccount != null) {
            System.out.println("User Profile:");
            System.out.println("Username: " + user.getUsername());
            System.out.println("Account Type: " + userAccount.getClass().getSimpleName()); // Display the account type
            System.out.println("Account Balance: " + userAccount.getBalance());
            // Add more details based on your account structure
        } else {
            System.out.println("User Profile:");
            System.out.println("Username: " + user.getUsername());
            System.out.println("No associated account found.");
        }
    }

    public void SignUp() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        System.out.print("Enter your mobile number: ");
        int mobileNumber = scanner.nextInt();

        System.out.print("Enter account type (1 for BankAccount, 2 for MobileAccount): ");
        int accountType = scanner.nextInt();

        Account newAccount;
        if (accountType == 1) {
            newAccount = new BankAccount();
        } else if (accountType == 2) {
            newAccount = new MobileAccount();
        } else {
            System.out.println("Invalid account type. Sign up failed.");
            return;
        }

        // Create a new user and associate the chosen account
        User newUser = new User(username, password, mobileNumber, newAccount);
        users.add(newUser);

        System.out.println("Sign up successful. Welcome, " + username + "!");
    }

    public void ChooseServices(User user) {
        System.out.println("Available services:");

        if (user.getAccount() instanceof BankAccount) {
            // If the user has a BankAccount, show all services
            services.displayAllServices();
        } else if (user.getAccount() instanceof MobileAccount) {
            // If the user has a MobileAccount, show all services except TransferToBank
            services.displayServicesExceptTransferToBank();
        } else {
            System.out.println("Unknown account type. Cannot display services.");
        }
    }


    public void logout() {
        // Implementation
    }
}


