package instapay.strategy;

import java.util.Scanner;
import User.*;
import Services.*;

public class MobileRegistration implements StrategyRegistration {
    private OTP otp;

    public MobileRegistration(OTP otp) {
        this.otp = otp;
    }

    @Override
    public User SignUp() {
        System.out.println("Mobile Registration...");

        // Collect mobile-specific registration details
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your mobile number: ");
        int mobileNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter your UserName: ");
        String name = scanner.nextLine();

        scanner.nextLine();

        System.out.print("Enter your Password: ");
        String password = scanner.nextLine();

        // Additional details specific to mobile registration
        // ...
        otp.generateOTP();
        sendOTP(mobileNumber);

        // Collect user input for OTP verification
        System.out.print("Enter the OTP sent to your mobile: ");
        String userInput = scanner.nextLine();

        // Verify mobile using OTP
        boolean isVerified = otp.verifyOTP(userInput);
        if (isVerified) {
            System.out.println("Mobile registration successful.");
            User newUser = new User(name, password, mobileNumber);
            newUser.setMobileNumber(mobileNumber);
            newUser.setUsername(name);  // Assuming username is set using the name entered
            return newUser;
        } else {
            System.out.println("Mobile verification failed. Registration aborted.");
            return null;
        }
    }

    private void sendOTP(int mobileNumber) {
        // Simulate sending OTP to the user's mobile number
        System.out.println("OTP sent to " + mobileNumber + ". Please check your mobile.");
    }
}
