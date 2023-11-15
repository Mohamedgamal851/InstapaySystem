import InstapaySystem.InstaPaySystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        InstaPaySystem instaPaySystem = new InstaPaySystem();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("1. Sign In");
            System.out.println("2. Sign Up");
            System.out.println("3. Choose Services");
            System.out.println("4. Logout");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    instaPaySystem.SignIn();
                    break;
                case 2:
                    instaPaySystem.SignUp();
                    break;
                case 3:
                    instaPaySystem.ChooseServices();
                    break;
                case 4:
                    instaPaySystem.logout();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("Exiting InstaPay System. Goodbye!");
    }
}
