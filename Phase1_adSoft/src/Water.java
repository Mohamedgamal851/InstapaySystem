import java.util.Scanner;

public class Water extends Bill{
    private String WaterConnectionNumber;
    private String WaterProvider;

    public Water(){
        description="Water Bill to recharge card of Water";
    }

    @Override
    public void takeDetails(User user) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Water Connection Number:");
        WaterConnectionNumber = scanner.nextLine();

        System.out.println("Enter Water Provider:");
        WaterProvider = scanner.nextLine();

        System.out.println("Enter amount needed to recharge:");
        amount= scanner.nextDouble();

        if(verify(WaterConnectionNumber,WaterProvider)) {

            deductFromUserAccount(user);
        }
    }


}
