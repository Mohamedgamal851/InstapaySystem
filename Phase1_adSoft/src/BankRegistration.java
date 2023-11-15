import java.util.Scanner;

public class BankRegistration implements StrategyRegistration {
    @Override
    public User SignUp() {
        Scanner scanner = new Scanner(System.in);

        AccountFactory factory = new BankAccountFactory();
        Account acc = factory.CreateAcc();

        System.out.println("Enter Username:");
        String username = scanner.nextLine();

        System.out.println("Enter Password:");
        String password = scanner.nextLine();

        System.out.println("Enter Mobile Number:");
        int mobileNumber = scanner.nextInt();

        User newUser = new User(username, password, mobileNumber, acc);

        return newUser;
    }
}
