package instapay.strategy;

import java.util.Random;

public class OTP {
    private String code;

    // Generate a random 6-digit OTP
    public void generateOTP() {
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000);
        this.code = String.valueOf(otp);
    }

    // Verify the provided OTP
    public boolean verifyOTP(String userInput) {
        return userInput.equals(this.code);
    }
}

