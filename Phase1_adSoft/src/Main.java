import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
                InstapaySystem instapaySystem = new InstapaySystem();
                Scanner scanner = new Scanner(System.in);
                boolean loggedIn = false;

                while (true) {
                    if (!loggedIn) {
                        System.out.println("1. Sign Up");
                        System.out.println("2. Sign In");
                        System.out.println("3. Exit");
                        System.out.print("Enter choice: ");
                        int choice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        switch (choice) {
                            case 1:
                                instapaySystem.signUp();
                                break;
                            case 2:
                                System.out.print("Enter username: ");
                                String username = scanner.nextLine();
                                System.out.print("Enter password: ");
                                String password = scanner.nextLine();
                                instapaySystem.signIn(username, password);
                                if (instapaySystem.getCurrentUser() != null) {
                                    loggedIn = true;
                                }
                                break;
                            case 3:
                                System.out.println("Exiting...");
                                return;
                            default:
                                System.out.println("Invalid choice!");
                                break;
                        }
                    } else {
                        instapaySystem.ChooseService();
                        System.out.println("Do you want to logout? (yes/no)");
                        String logoutChoice = scanner.nextLine();
                        if (logoutChoice.equalsIgnoreCase("yes")) {
                            instapaySystem.logout(instapaySystem.getCurrentUser());
                            loggedIn = false;
                        }
                    }
                }
            }
        }


