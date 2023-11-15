import java.util.Scanner;

public class TransferToBankAccount implements Transfer{
    @Override
    public void excute(double amount, User user) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the bank account number to transfer money:");
        int targetBankAccount = scanner.nextInt(); // Read bank account number from user input

        // For demonstration purposes, we'll just print the details
        System.out.println("Initiating transfer of $" + amount + " to bank account number: " + targetBankAccount);

        user.getAcc().withdraw(amount);

        System.out.println("Successful Transfer To Bank Account" + targetBankAccount);

    }
}
