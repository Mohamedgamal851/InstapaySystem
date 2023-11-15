import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class InstapaySystem {
    private List<User> users;
    private List<Transaction> transactions;



    private User CurrentUser;

    private Services services=new Services();


    public InstapaySystem() {
        users = new ArrayList<>();
        transactions = new ArrayList<>();
    }


    public void addUser(User user) {
        users.add(user);
    }



    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void ChooseService() {
        Scanner scanner = new Scanner(System.in);

        // Display available services
        System.out.println("Available Services:");
        System.out.println("1. Transfer to Wallet using the mobile number");
        System.out.println("2. Transfer to Another Instapay account");
        System.out.println("3. Transfer to Bank account");
        System.out.println("4. Inquire about balance");
        System.out.println("5. Pay bills (Gas, Water, Electricity)");
        System.out.println("6. Deposit to account");

        // Get user's choice
        System.out.print("Enter your choice (1-6): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        // Logic to retrieve service based on user's choice
        double amount;
        switch (choice) {
            case 1:
                System.out.print("Enter needed amount:");
                amount = scanner.nextDouble();
                services.transferToWalletUsingMobileNumber(amount,CurrentUser);
                break;
            case 2:
                System.out.print("Enter needed amount:");
                amount = scanner.nextDouble();
                services.transferToAnotherInstapayAccount(amount,CurrentUser);
                break;
            case 3:
                System.out.print("Enter needed amount:");
                amount = scanner.nextDouble();
                services.transferToBankAccount(amount,CurrentUser);
                break;
            case 4:
                services.inquireAboutBalance(CurrentUser);
                break;
            case 5:
                String Type;
                System.out.println("Enter Type of Bill");
                Type=scanner.nextLine();
                Bill bill=BillFactory.createBill(Type);
                services.payBills(bill,CurrentUser);
                break;

            case 6:
                depositToAccount();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
    }


    public void signUp(){
         int AccType;
         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter Account Type:" +
                "1.Bank Account" +
                "2.Mobile Account");

         AccType=scanner.nextInt();

        switch (AccType) {
            case 1:
                BankRegistration bankRegistration = new BankRegistration();
                CurrentUser=bankRegistration.SignUp();
                addUser(CurrentUser);
                break;
            case 2:
                MobileRegistration mobileRegistration = new MobileRegistration();
                CurrentUser=mobileRegistration.SignUp();
                addUser(CurrentUser);
                break;
            default:
                System.out.println("Invalid Account Type!");
                break;
        }





    };



    public void signIn(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                CurrentUser=user;
                return;
            }
        }
        System.out.println("Invalid username or password.");
    }


    public User getCurrentUser() {
        return CurrentUser;
    }

    public void depositToAccount() {
        Scanner scanner = new Scanner(System.in);

        if (CurrentUser != null && CurrentUser.getAcc() != null) {
            System.out.print("Enter the amount to deposit: ");
            double amount = scanner.nextDouble();
            CurrentUser.getAcc().deposite(amount);
        } else {
            System.out.println("User not logged in or no account found.");
        }
    }
    public void logout(User user) {
        CurrentUser=null;
        System.out.println("You are Logout Now.");
    }


}