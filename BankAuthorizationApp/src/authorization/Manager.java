package authorization;

public class Manager extends Authorization {

    @Override
    public void authorize(double amount) {
        if (amount > 1000000) {
            System.out.println("Manager approved the withdrawal of Tk. " + amount);
        } else {
            System.out.println("Manager does not handle this range.");
        }
    }
}
