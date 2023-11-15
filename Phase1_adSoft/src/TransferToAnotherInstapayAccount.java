import java.util.Scanner;

public class TransferToAnotherInstapayAccount implements Transfer{
    @Override
    public void excute(double amount, User user) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Instapay account number to transfer money:");
        int targetInstapayAccount = scanner.nextInt(); // Read bank account number from user input

        // For demonstration purposes, we'll just print the details
        System.out.println("Initiating transfer of $" + amount + " to Instapay account number: " + targetInstapayAccount);

        user.getAcc().withdraw(amount);

        System.out.println("Successful Transfer To Instapay Account" + targetInstapayAccount);
    }
}
