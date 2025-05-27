package authorization;

public class BankApp {
    public static void main(String[] args) {
        // Creating instances of each handler
        Authorization cashier = new Cashier();
        Authorization seniorOfficer = new SeniorOfficer();
        Authorization manager = new Manager();

        // Set up the chain of responsibility
        cashier.setNextHandler(seniorOfficer);
        seniorOfficer.setNextHandler(manager);

        // Test different withdrawal amounts
        double[] amounts = {5000, 50000, 1500000};

        for (double amount : amounts) {
            System.out.println("\nProcessing withdrawal of Tk. " + amount);
            cashier.authorize(amount);
        }
    }
}
