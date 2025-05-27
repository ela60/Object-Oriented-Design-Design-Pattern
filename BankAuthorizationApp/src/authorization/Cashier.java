package authorization;

public class Cashier extends Authorization {

    @Override
    public void authorize(double amount) {
        if (amount < 10000) {
            System.out.println("Cashier approved the withdrawal of Tk. " + amount);
        } else if (nextHandler != null) {
            System.out.println("Cashier authorize the request for Tk. " + amount);
            nextHandler.authorize(amount);
        }
    }
}
