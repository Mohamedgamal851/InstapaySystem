import java.util.Scanner;

public class BankAccountFactory implements AccountFactory{
    @Override
    public Account CreateAcc() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Bank Account Number:");
        int bankAccountNumber = scanner.nextInt();

        System.out.println("Enter Bank Name:");
        String bankName = scanner.next(); // Assuming bank name is a string

        System.out.println("Enter CVV:");
        int cvv = scanner.nextInt();

        // Creating a BankAccount object using the provided information
        BankAccount bankAccount = new BankAccount(bankAccountNumber, bankName, cvv);

        return bankAccount;
    }
}
