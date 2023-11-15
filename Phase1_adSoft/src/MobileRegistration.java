import java.util.Scanner;

public class MobileRegistration implements StrategyRegistration {
    OTP otp=new OTP();
    @Override
    public User SignUp() {
        Scanner scanner = new Scanner(System.in);

        AccountFactory factory = new MobileAccountFactory();
        Account acc = factory.CreateAcc();

        System.out.println("Enter Username:");
        String username = scanner.nextLine();

        System.out.println("Enter Password:");
        String password = scanner.nextLine();

        System.out.println("Enter Mobile Number:");
        int mobileNumber = scanner.nextInt();
        if(otp.Verify()) {
           System.out.println("Verify Done Successfully");
        }
        User newUser = new User(username, password, mobileNumber, acc);

        return newUser;

    }
}
