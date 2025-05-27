package authorization;

public abstract class Authorization {
    protected Authorization nextHandler;

    // Set the next handler in the chain
    public void setNextHandler(Authorization nextHandler) {
        this.nextHandler = nextHandler;
    }

    // Abstract method to be implemented by concrete classes
    public abstract void authorize(double amount);
}
