package authorization;

public class SeniorOfficer extends Authorization {

    @Override
    public void authorize(double amount) {
        if (amount >= 10000 && amount <= 1000000) {
            System.out.println("Senior Officer approved the withdrawal of Tk. " + amount);
        } else if (amount > 1000000 && nextHandler != null) {
            System.out.println("Senior Officer authorize the request for Tk. " + amount);
            nextHandler.authorize(amount);
        } else {
            System.out.println("Senior Officer cannot process this request.");
        }
    }
}
