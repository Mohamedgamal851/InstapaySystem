import java.util.Scanner;

public class Electricity extends Bill{

    private String ElectricityConnectionNumber;
    private String ElectricityProvider;

    public Electricity(){
        description="Electricity Bill to recharge card of Electricity";
    }

    @Override
    public void takeDetails(User user) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Electricity Connection Number:");
        ElectricityConnectionNumber = scanner.nextLine();

        System.out.println("Enter Electricity Provider:");
        ElectricityProvider = scanner.nextLine();

        System.out.println("Enter amount needed to recharge:");
        amount= scanner.nextDouble();

       if (verify(ElectricityConnectionNumber,ElectricityProvider)) {

           deductFromUserAccount(user);
       }
    }



}
