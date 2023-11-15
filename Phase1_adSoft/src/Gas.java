import java.util.Scanner;

public class Gas extends Bill{
    private String gasConnectionNumber;
    private String gasProvider;

    public Gas(){
        description="Gas Bill to recharge card of Gas";
    }

    @Override
    public void takeDetails(User user) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Gas Connection Number:");
        gasConnectionNumber = scanner.nextLine();

        System.out.println("Enter Gas Provider:");
        gasProvider = scanner.nextLine();

        System.out.println("Enter amount needed to recharge:");
        amount= scanner.nextDouble();

        if(verify(gasConnectionNumber,gasProvider)){

            deductFromUserAccount(user);
        }
    }



}
