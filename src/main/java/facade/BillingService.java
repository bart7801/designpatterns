package facade;

public class BillingService {

    public boolean bill(String creditCardNumber, double amount) {
        if (amount > 10000) {
            System.out.println("wife wanted to spend too much");
            return false;
        }
        System.out.println(
                String.format("wife spent shopping %s from account %s",
                        amount, creditCardNumber));
        return true;
    }
}
